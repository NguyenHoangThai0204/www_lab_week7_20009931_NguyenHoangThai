package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.frontend.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.checkerframework.checker.units.qual.C;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Customer;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Employee;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories.CustomerRepository;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories.EmployeeRepository;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.frontend.modal.EmployeeModal;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.frontend.modal.CustomerModal;
import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class Controller extends HttpServlet {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    CustomerRepository customerRepository = new CustomerRepository();
    private String message;
    public List<Employee> listEmp( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employees = employeeRepository.getAllEmp();
        request.setAttribute("listEmployees", employees);
        request.getRequestDispatcher("/listEmployees.jsp")
                .forward(request, response);
        return null;
    }
    public List<Customer> listCus( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customer = customerRepository.getAllCus();
        request.setAttribute("listCustomer", customer);
        request.getRequestDispatcher("/listCustomer.jsp")
                .forward(request, response);
        return null;
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        if(action.equals("listEmployees")){
            try {
                listEmp(request, response);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        if(action.equals("insertCustomer")){
            try {
                listCus(request, response);
            }catch (Exception e){
                throw  new RuntimeException();
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if(action.equals("insertUpdateEmployee")){
            try {
                EmployeeModal employeeModal = new EmployeeModal();
                employeeModal.insertEmp(req, resp);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
        if(action.equals("insertUpdateCus")){
            try {
                CustomerModal customerModal = new CustomerModal();
                customerModal.insertCus(req, resp);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }

    }

    public void destroy() {
    }
}
