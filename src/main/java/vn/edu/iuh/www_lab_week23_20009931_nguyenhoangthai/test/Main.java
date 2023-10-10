package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.test;


import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.connectDb.ConnectFactory;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Customer;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Employee;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Product;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.enums.*;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories.CustomerRepository;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories.EmployeeRepository;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories.ProductRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
   //     ConnectFactory.getInstance();

        EmployeeRepository employeeRepository = new EmployeeRepository();
//        Employee e = new Employee("Thai", Date.valueOf(LocalDate.now()),"thai@","asdg guyonw s", EmployeeStatus.ACCTIVE);
//        employeeRepository.insertEmp(e);
        List<Employee> employees = employeeRepository.getAllEmp();
        for (Employee  e : employees
             ) {
            System.out.println(e);
        }
        ProductRepository productRepository = new ProductRepository();
//        Product p = new Product("thai", "xin chao cho", "sd gds", "tehg ", ProductStatus.ACCTIVE);
//        productRepository.insertPro(p);
        List<Product> pro = productRepository.getAllPro();
        for (Product  e : pro
        ) {
            System.out.println(e);
        }
        CustomerRepository customerRepository = new CustomerRepository();
//        Customer customer = new Customer("thai", "thai","1564646", "tegs sadg");
//        customerRepository.insertCus(customer);
        List<Customer> cus = customerRepository.getAllCus();
        for (Customer  e : cus
        ) {
            System.out.println(e);
        }
    }
}
