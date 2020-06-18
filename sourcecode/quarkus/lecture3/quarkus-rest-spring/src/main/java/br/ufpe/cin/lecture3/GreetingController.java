package br.ufpe.cin.lecture3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Bora BAÊA, minha %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "po**@") String name) {

        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}
