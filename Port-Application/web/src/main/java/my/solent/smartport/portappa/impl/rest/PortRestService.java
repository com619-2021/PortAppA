/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.solent.smartport.portappa.impl.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Set;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import my.solent.smartport.model.dto.ReplyMessage;
import my.solent.smartport.model.port.dto.Port;
import my.solent.smartport.model.port.service.PortService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 1985j
 */

@Component
@Path("/api/v1/port/")
public class PortRestService {

    final static Logger LOG = LogManager.getLogger(PortRestService.class);

    //@Autowired
    private PortService portService;

    @Operation(summary = "Find all ports",
            tags = {"Port Management API"},
            responses = {
                @ApiResponse(responseCode = "200", description = "successful operation returns port list *with one entry*", content = @Content(
                        schema = @Schema(implementation = ReplyMessage.class))),
                @ApiResponse(responseCode = "500", description = "internal server error")
            })
    @GET
    @Path("/port")
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Transactional(readOnly = true)
    public Response getPorts(@Context UriInfo uriInfo) {
        try {
            ReplyMessage replyMessage = new ReplyMessage();
            LOG.debug("/getPorts called");

            if (portService == null) {
                throw new RuntimeException("portService==null and has not been initialised");
            }

            List<Port> portList = portService.findAll();

            String requestPath = uriInfo.getAbsolutePath().toASCIIString();

            // converting to set
            Set<Port> unboundList = unbindPortList(new LinkedHashSet(portList), requestPath);

            // converting to list
            replyMessage.setPortList(new ArrayList(unboundList));
            replyMessage.setLimit(unboundList.size());

            replyMessage.setCode(Response.Status.OK.getStatusCode());

            return Response.status(Response.Status.OK).entity(replyMessage).build();

        } catch (Exception ex) {
            LOG.error("error calling /party getPorts ", ex);
            ReplyMessage replyMessage = new ReplyMessage();
            replyMessage.setCode(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
            replyMessage.setDebugMessage("error calling /party getPorts " + ex.getMessage());
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(replyMessage).build();
        }
    }

    /**
     * clones new ports and unbinds from entitymanager
     *
     * @param portList
     * @param requestPath
     * @return
     */
    public static Set<Port> unbindPortList(Set<Port> portList, String requestPath) {
        Set<Port> unboundPort = new LinkedHashSet();

        //decouples values from dao
        for (Port port : portList) {
            Port newPort = new Port();

            // add absolute path href for user
            String uuid = port.getUuid();

            String href = requestPath.substring(0, requestPath.indexOf("/api/")) + "/api/v1/port" + "/" + uuid;
            LOG.debug("setting href for party uuid:" + uuid + " href=" + href);
            newPort.setHref(href);

            newPort.setUuid(uuid);
            newPort.setName(port.getName());
            newPort.setLocation(port.getLocation());
            newPort.setDocks(port.getDocks());
            newPort.setId(port.getId());
            newPort.setStatus(port.getStatus());

            unboundPort.add(newPort);
        }
        return unboundPort;
    }
}
