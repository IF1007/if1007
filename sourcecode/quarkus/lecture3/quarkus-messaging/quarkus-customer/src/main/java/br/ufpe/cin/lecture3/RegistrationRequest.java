package br.ufpe.cin.lecture3;

public class RegistrationRequest {
    public String name;
    public String email;

    public Customer toModel() {
        return new Customer(name, email);
    }

    @Override
    public String toString() {
        return "RegistrationRequest{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
