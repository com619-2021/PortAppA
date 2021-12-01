/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.solent.smartport.portappa.impl.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import my.solent.smartport.model.service.ServiceFacade;
/**
 *
 * @author 1985j
 */
@Component
@Path("/service")
public class RestService {
     // SETS UP LOGGING 
    // note that log name will be org.solent.com504.project.impl.rest.RestService
    final static Logger LOG = LogManager.getLogger(RestService.class);
    
    { 
        System.out.println("***********************  starting RestService");
    
    }

    // This serviceFacade object is injected by Spring
   // @Autowired(required = true)
//  @Qualifier("serviceFacade")
    ServiceFacade serviceFacade = null;
    
    @Operation(
               tags = {"service/test"},
               summary = "all this does is ask for a text 'hello world' response",
               description = "Returns text hello world",
               responses = {
                   @ApiResponse(description = "hello world message",
                           content = @Content(mediaType = "text/plain"))
               })

    @GET
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.TEXT_PLAIN})
    @Produces({MediaType.TEXT_PLAIN})
    @Path("/message")
    public String message() {
        LOG.debug("project-web called");
        return "Hello, rest!";
    }

}
