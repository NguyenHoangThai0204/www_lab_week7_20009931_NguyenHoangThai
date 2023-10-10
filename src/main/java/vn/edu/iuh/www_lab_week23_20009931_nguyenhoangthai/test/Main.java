package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.test;


import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.connectDb.ConnectFactory;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.enums.EmployeeStatus;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.models.Employee;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.repositories.EmployeeRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        ConnectFactory.getInstance();

        EmployeeRepository employeeRepository = new EmployeeRepository();
////        Employee e = new Employee("Thai", Date.now(),"thai@","asdg guyonw s", EmployeeStatus.ACCTIVE);
////        employeeRepository.insertEmpl(e);
        List<Employee> employees = employeeRepository.getAllEmp();
        for (Employee  e : employees
             ) {
            System.out.println(e);
        }
    }
}
