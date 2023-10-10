package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.models.Employee;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.repositories.EmployeeRepository;

import java.io.IOException;
import java.util.List;

@WebServlet("/home")
public class Controller extends HttpServlet {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    private String message;
    public List<Employee> listEmp( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employees = employeeRepository.getAllEmp();
        request.setAttribute("listEmployees", employees);
        request.getRequestDispatcher("/listEmployees.jsp")
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
    }

    public void destroy() {
    }
}
