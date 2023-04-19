package org.acme.conf;

import jakarta.inject.Inject;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class WebRouter {
    @Inject
    private Pw2Config config;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String showMessage() {
        return config.message();
    }
}