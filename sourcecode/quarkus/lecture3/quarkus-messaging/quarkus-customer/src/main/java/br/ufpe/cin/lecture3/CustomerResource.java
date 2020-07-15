package br.ufpe.cin.lecture3;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

@Path("/customers")
public class CustomerResource {

    @GET
    @Produces("application/json")
    @Path("{id}")
    public Customer get(@PathParam("id") Long id) {
        return (Customer) Customer.findByIdOptional(id)
                .orElseThrow(NotFoundException::new);
    }

    @GET
    @Produces("application/json")
    public List<Customer> list() {
        return Customer.listAll();
    }

    @Transactional
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public Response add(Customer entity, @Context UriInfo info) {
        entity.persist();
        URI uri = build(info.getBaseUriBuilder(), entity.id);
        return Response.created(uri).build();
    }

    @Transactional
    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    @Path("{id}")
    public Response update(@PathParam("id") Long id, Customer book, @Context UriInfo info) {
        Customer.update(id, book);

        URI uri = build(info.getBaseUriBuilder(), id);
        return Response.created(uri).build();
    }

    @Transactional
    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") Long id) {
        Customer.deleteById(id);
    }

    private URI build(UriBuilder builder, Long id) {
        return builder.path(CustomerResource.class).path("/" + id).build();
    }
}
