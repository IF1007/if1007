package br.ufpe.cin.lecture3;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.BadRequestException;
import java.util.Optional;

@ApplicationScoped
public class CustomerService {

    private static final Logger log = LoggerFactory.getLogger(CustomerService.class);

    @Inject
    @Channel("registration-channel")
    private Emitter<String> registeredCustomerEmitter;

    public Customer register(Customer customer) {
        Optional<Customer> dbCustomer = Customer.findByName(customer.getName());

        if (dbCustomer.isPresent()) {
            throw new BadRequestException();
        }

        customer.persist();
        log.info("sending message: " + customer.getEmail());
        registeredCustomerEmitter.send(customer.getEmail());

        return customer;
    }
}
