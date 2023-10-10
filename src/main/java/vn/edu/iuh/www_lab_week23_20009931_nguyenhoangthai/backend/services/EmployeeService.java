package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.services;

import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Employee;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository repository;

    public EmployeeService() {
        repository = new EmployeeRepository();
    }

    public void insertEmp(Employee employee) {
        repository.insertEmp(employee);
    }

//    public Optional<Employee> findById(long id) {
//        return repository.findbyId(id);
//    }

//    public boolean delete(long id) {
//        Optional<Employee> op = findById(id);
//        if (op.isPresent()) {
//            Employee employee = op.get();
//            employee.setStatus(EmployeeStatus.TERMINATED);
//            return true;
//        }
//        return false;
//    }

//    public boolean activeEmp(long id) {
//        Optional<Employee> op = findById(id);
//        if (op.isPresent()) {
//            Employee employee = op.get();
//            employee.setStatus(EmployeeStatus.ACTIVE);
//            return true;
//        }
//        return false;
//    }

    public List<Employee> getAll() {

        return repository.getAllEmp();
    }
}

