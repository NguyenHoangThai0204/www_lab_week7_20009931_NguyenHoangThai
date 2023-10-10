package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.frontend.modal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.enums.EmployeeStatus;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Employee;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.services.EmployeeService;

import java.io.IOException;
import java.sql.Date;

public class EmployeeModal {
    public void insertEmp(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("nameEm");
        Date date = Date.valueOf(req.getParameter("dateEm"));
        String address = req.getParameter("addEm");
        String email = req.getParameter("emailEm");
        String status = req.getParameter("statusEm");
        EmployeeStatus employeeStatus = null;
        if ( status != null){
            switch (status){
                case "0":
                    employeeStatus = EmployeeStatus.IN_ACCTIVE;
                    break;
                case "1":
                    employeeStatus = EmployeeStatus.ACCTIVE;
                    break;
                case "-1":
                    employeeStatus = EmployeeStatus.TERMINATE;
                    break;
                default:break;
            }
        }
        Employee employee = new Employee(name, date, email, address, employeeStatus);

        EmployeeService employeeService = new EmployeeService();
        employeeService.insertEmp(employee);

        resp.sendRedirect("../webapp/index.jsp");
    }
}
