package br.ufpe.cin.lecture3;

import io.quarkus.mailer.Mail;
import io.quarkus.mailer.Mailer;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Receiver {

    private final Logger log = LoggerFactory.getLogger(Receiver.class);

//    @Inject
//    private Mailer mailer;

    @Incoming("registration-channel")
    public void processMessage(String email) {
        log.info(email);

//        mailer.send(Mail.withText(
//                email,
//                "Registration",
//                "Successfully Registered"
//                ));
    }
}
