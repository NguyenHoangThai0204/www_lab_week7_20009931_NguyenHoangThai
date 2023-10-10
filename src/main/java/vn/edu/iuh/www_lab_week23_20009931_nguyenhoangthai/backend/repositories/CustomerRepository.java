package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.connectDb.ConnectFactory;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Customer;

import java.util.List;

public class CustomerRepository {
    private SessionFactory sessionFactory;
    private final Logger logger =
            LoggerFactory.getLogger(this.getClass().getName());
    public CustomerRepository(){
        this.sessionFactory = ConnectFactory.getInstance().getSessionFactory();
    }
    public void insertCus(Customer customer){
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(customer);
            transaction.commit();
        }catch (Exception e){
            logger.error(e.getMessage());
            transaction.rollback();
        }
    }


    public List<Customer> getAllCus() {
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            List<Customer> list = session
                    .createNativeQuery("select * from Customer", Customer.class)
                    .getResultList();
            transaction.commit();
            return list;
        } catch (Exception e) {
            logger.error(e.getMessage());
            transaction.rollback();
        }
        return null;
    }
}
