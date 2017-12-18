package mx.neftaly.swarmprueba.rest;


import mx.neftaly.swarmprueba.rest.domain.TestDomain;
import mx.neftaly.swarmprueba.rest.services.TestService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.logging.Logger;

@Path("/hello")
@RequestScoped
public class HelloWorldEndpoint {

    @Inject
    private TestService testService;

    private Logger logger = Logger.getLogger(this.getClass().getName());

    @GET
    @Produces("text/plain")
    public Response doGet() {
        return Response.ok("Hello from WildFly Swarm!").build();
    }


    @GET
    @Produces("application/json")
    @Path("/memes")
    public Response getNew() {
        testService.createNewTestDomain();
        List<TestDomain> domains = testService.getAll();
        String newText = testService.getGreeting("memes");
        logger.info(newText);
        return Response.ok(domains).build();
    }
}