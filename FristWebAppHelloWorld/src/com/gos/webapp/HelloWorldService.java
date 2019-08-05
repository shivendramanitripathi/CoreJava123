package com.gos.webapp;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldService {

    @GET
    @Path("/{param}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response getMsg(@PathParam("param") String msg){
        String output = "Jersey from HelloWorld is saying hi: "+msg;
        return Response.status(200).entity(output).build();
    }

    @GET
    public Response getMsg(){
        String output = "Jersey say : Hello";
        return Response.status(200).entity(output).build();
    }

}