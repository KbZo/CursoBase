package org.acme;

import org.eclipse.microprofile.config.inject.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {
    @ConfigProperty(name="greeting")
    private String greeting;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }
    //SI cambio en esta clase tambien se cambia en la clase testHelloEndpoint

    @GET
    @Produces(MediaType.TEXT_PLAIN) //Retornar Texto Plano
    @Path("custom/{name}")
    public String customHello(@PathParam("name") String name){
        return greeting + " Quarkus Framework "+name + " Te amito mucho";
    }
}