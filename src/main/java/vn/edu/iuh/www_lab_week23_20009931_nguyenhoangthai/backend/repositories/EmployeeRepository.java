package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.connectDb.ConnectFactory;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Employee;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Product;


import java.util.List;

public class EmployeeRepository {
   private SessionFactory sessionFactory;
   private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

   public EmployeeRepository(){
       this.sessionFactory = ConnectFactory.getInstance().getSessionFactory();
   }
    public void insertEmp(Employee employee){
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(employee);
            transaction.commit();
        }catch (Exception e){
            logger.error(e.getMessage());
            transaction.rollback();

        }
   }
   public List<Employee> getAllEmp(){
       Transaction transaction = null;
       try {
           Session session = sessionFactory.openSession();
           transaction = session.beginTransaction();
           List<Employee> employees = session
                   .createNativeQuery("select * FROM Employee ", Employee.class)
                  .getResultList();
           transaction.commit();
           return  employees;
       }catch (Exception e){
           logger.error(e.getMessage());
           transaction.rollback();
       }

       return null;
   }

}
