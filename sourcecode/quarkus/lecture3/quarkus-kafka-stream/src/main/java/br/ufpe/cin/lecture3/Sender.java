package br.ufpe.cin.lecture3;

import com.github.javafaker.Faker;
import io.reactivex.Flowable;
import org.eclipse.microprofile.reactive.messaging.Outgoing;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.TimeUnit;

@ApplicationScoped
public class Sender {

    private Faker faker = new Faker();

    @Outgoing("generated-name")
    public Flowable<String> send() {
        return Flowable.interval(3, TimeUnit.SECONDS)
                .map(aLong -> faker.funnyName().name());
    }
}
