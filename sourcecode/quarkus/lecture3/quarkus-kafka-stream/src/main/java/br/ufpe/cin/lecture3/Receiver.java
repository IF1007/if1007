package br.ufpe.cin.lecture3;

import io.smallrye.reactive.messaging.annotations.Broadcast;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class Receiver {

    private final Logger log = LoggerFactory.getLogger(Receiver.class);

    private static final String template = "Bora BAÊA, minha %s!";

    @Incoming("names")
    @Outgoing("names-stream")
    @Broadcast
    public String processMessage(String receivedName) {
        log.info(receivedName);
        return String.format(template, receivedName);
    }
}
