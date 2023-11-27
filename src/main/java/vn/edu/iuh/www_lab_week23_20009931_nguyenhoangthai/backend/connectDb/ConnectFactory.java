package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.connectDb;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.*;



public class    ConnectFactory{
    private static ConnectFactory instance = null;
    private SessionFactory sessionFactory = null;
    public ConnectFactory() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata;
        metadata = new MetadataSources(registry)
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(ProductPrice.class)
                .addAnnotatedClass(Product_image.class)
                .addAnnotatedClass(Order.class)
                .addAnnotatedClass(OrderDetail.class)
                .getMetadataBuilder().build();
        sessionFactory = metadata.getSessionFactoryBuilder().build();
    }
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    public static ConnectFactory getInstance() {
        if (instance == null)
            instance = new ConnectFactory();
        return instance;
    }
}