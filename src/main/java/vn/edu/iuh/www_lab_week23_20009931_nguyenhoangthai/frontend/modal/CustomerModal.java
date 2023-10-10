package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.frontend.modal;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Customer;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.services.CustomerService;

public class CustomerModal {

    public void insertCus(HttpServletRequest req, HttpServletResponse resp) {
        String name = req.getParameter("nameCus");
        String add = req.getParameter("addCus");
        String email = req.getParameter("emailCus");
        String phone = req.getParameter("phoneCus");

        Customer customer = new Customer(name, email, phone, add);
        CustomerService customerService = new CustomerService();
        customerService.insertCus(customer);

    }
}
