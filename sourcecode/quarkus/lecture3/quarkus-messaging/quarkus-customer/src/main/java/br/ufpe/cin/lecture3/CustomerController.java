package br.ufpe.cin.lecture3;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/register")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @POST
    @Produces("application/json")
    @Consumes("application/json")
    @Transactional
    public Customer register(RegistrationRequest request) {
        System.out.println(request);
        return customerService.register(request.toModel());
    }
}
