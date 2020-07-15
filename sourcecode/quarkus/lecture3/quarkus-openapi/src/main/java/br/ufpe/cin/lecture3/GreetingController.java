package br.ufpe.cin.lecture3;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/greeting")
public class GreetingController {

    private static final String template = "Bora BAÊA, minha %s!";
    private final AtomicLong counter = new AtomicLong();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting greeting(@QueryParam(value = "name") @DefaultValue("po**@") String name) {

        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
