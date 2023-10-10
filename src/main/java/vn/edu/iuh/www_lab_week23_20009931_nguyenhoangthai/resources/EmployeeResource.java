package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.models.Employee;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.services.EmployeeService;

import java.util.List;

@Path("/employees")
public class EmployeeResource {
    private  final EmployeeService employeeService ;

    public EmployeeResource() {
        employeeService = new EmployeeService();
    }
    @GET
    @Produces("application/json")
    public Response getAll() {
         List<Employee> lst = employeeService.getAll();
         return Response.ok(lst).build();
    }
}
