/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.solent.smartport.portappa.impl.rest;

/**
 *
 * @author 1985j
 */
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.annotations.servers.ServerVariable;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

// see https://github.com/swagger-api/swagger-core/wiki/Swagger-2.X---Annotations#server
// see also https://github.com/OAI/OpenAPI-Specification/blob/3.0.1/versions/3.0.1.md#serverObject
@OpenAPIDefinition(
        tags = { //   @Tag(name="widget", description="Widget operations."),
        //   @Tag(name="gasket", description="Operations related to gaskets")
        },
        info = @Info(
                title = "Smart Port API",
                version = "v1",
                description = "Solent university devops https://github.com/com619-2021",
                contact = @Contact(
                        name = "James Richardson",
                        email = "3richj71@solent.ac.uk"),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0.html")),
        servers = {
            @Server(
                    description = "localhost",
                    url = "{schema}://{host}:{port}/project-web",
                    variables = {
                        @ServerVariable(name = "schema", description = "url schema", defaultValue = "http", allowableValues = {"http", "https"}),
                        @ServerVariable(name = "host", description = "dns hostname", defaultValue = "localhost", allowableValues = {"localhost", "org.example.com"}),
                        @ServerVariable(name = "port", description = "html port", defaultValue = "8080", allowableValues = {"8080", "443"}),})
        }
)
@Component
@ApplicationPath("/rest")
public class RestApp extends ResourceConfig {

    final static Logger LOG = LogManager.getLogger(RestApp.class);

    // produces http://localhost:8080/project-web/rest/openapi.json 
    // see https://github.com/swagger-api/swagger-core/wiki/Swagger-2.X---Getting-started
    public RestApp() {

        {
            LOG.debug("*************************** starting rest application");
        }

        packages("my.solent.smartport.protappa.impl.rest",
                "my.solent.smartport",
                "io.swagger.v3.jaxrs2.integration.resources"
        );

        // this sets up jersey server logging of messages
        // note using jul logging which is converted go log4j
        // see https://www.javaguides.net/2018/06/jersey-rest-logging-using-loggingfeature.html
        register(new LoggingFeature(java.util.logging.Logger.getLogger(LoggingFeature.DEFAULT_LOGGER_NAME),
                java.util.logging.Level.INFO, LoggingFeature.Verbosity.PAYLOAD_ANY, 10000));

    }
    // configureSwagger();
}
