package br.ufpe.cin.lecture3;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import javax.ws.rs.NotFoundException;
import java.util.Optional;

@Entity
public class Customer extends PanacheEntity {

    private String name;
    private String email;

    protected Customer() {
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public static Optional<Customer> findByName(String name) {
        return Customer.find("name", name).singleResultOptional();
    }

    public static Customer update(Long id, Customer customer) {
        Customer entity = (Customer) Customer.findByIdOptional(id)
                .orElseThrow(NotFoundException::new);

        entity.name = customer.name;
        entity.email = customer.email;
        entity.persist();

        return entity;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
