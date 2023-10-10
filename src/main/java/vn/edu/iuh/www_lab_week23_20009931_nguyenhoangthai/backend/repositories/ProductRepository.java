package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.connectDb.ConnectFactory;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Product;

import java.util.List;

public class ProductRepository {
    private SessionFactory sessionFactory;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    public ProductRepository(){
        this.sessionFactory = ConnectFactory.getInstance().getSessionFactory();
    }

    public void insertPro(Product p){
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(p);
            transaction.commit();
        }catch (Exception e){
            logger.error(e.getMessage());
            transaction.rollback();
        }
    }
    public List<Product> getAllPro(){
        Transaction transaction = null;
        try {
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            List<Product> lst = session
                    .createNativeQuery("select * from Product", Product.class)
                    .getResultList();
            transaction.commit();
            return lst;
        }catch (Exception e){
            logger.error(e.getMessage());
            transaction.rollback();
        }
        return null;
    }


}
