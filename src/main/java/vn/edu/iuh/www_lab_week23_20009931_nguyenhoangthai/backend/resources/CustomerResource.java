package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Customer;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.services.CustomerService;

import java.util.List;

@Path("/customers")
public class CustomerResource {
    private final CustomerService customerService;
    public CustomerResource(){
        customerService = new CustomerService();
    }
    @GET
    @Produces("application/json")
    @Consumes("application/json")
    public Response getAll(){
        List<Customer> lst = customerService.getAllCus();
        return Response.ok(lst).build();
    }
}
