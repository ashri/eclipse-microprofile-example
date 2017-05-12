package me.ashri.experiments.mpconfig;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("")
public class GreetingResource {

    @Inject
    @Named("greeting")
    String greeting;

    @GET
    public Response greet(@QueryParam("name") String name) {
        if (name == null) {
            name = "Anonymous User";
        }
        String message = String.format("%s %s", greeting, name);
        return Response.ok(message).build();
    }
}
