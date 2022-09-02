package com.example.controller;

import com.example.model.Developer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/developer")
public class DeveloperController {
    @GET
    public List<Developer> getAll(){
        return Developer.listAll();
    }
    @GET
    @Path("/{id}")
    public Response getById(Long id){
        return Developer.findByIdOptional(id)
                .map(developer -> Response.ok(developer).build())
                .orElse(Response.status(Response.Status.NO_CONTENT).build());
    }
}
