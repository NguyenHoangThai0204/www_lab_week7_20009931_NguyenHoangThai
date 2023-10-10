package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.services;

import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Customer;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories.CustomerRepository;

import java.util.List;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService(){
        customerRepository = new CustomerRepository();
    }

    public void insertCus(Customer customer) {
        customerRepository.insertCus(customer);
    }
    public List<Customer> getAllCus(){
        return customerRepository.getAllCus();

    }
}
