package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import org.glassfish.hk2.api.Customize;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.services.EmployeeService;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Employee;

import java.util.List;

@Path("/employees")
public class EmployeeResource {
    private  final EmployeeService employeeService ;

    public EmployeeResource() {
        employeeService = new EmployeeService();
    }
    @GET
    @Produces("application/json")
    @Consumes("application/json")
    public Response getAll() {
         List<Employee> lst = employeeService.getAll();
         return Response.ok(lst).build();
    }
}
