package my.controller;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import my.service.SimpleService;

@Component
@Path("/")
public class HelloResource {
    @Inject
    private SimpleService service;

    @GET
    public String index() {
        return "Hello Spring Jersey!";
    }

    @GET
    @Path("/select01")
    public String select01() {
        this.service.select01();
        return "aa";
    }
}
