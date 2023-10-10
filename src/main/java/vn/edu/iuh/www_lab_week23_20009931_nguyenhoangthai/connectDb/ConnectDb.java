package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.connectDb;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnectDb {
    private static ConnectDb instance;
    private EntityManagerFactory emf;
    public ConnectDb() {
        emf = Persistence
                .createEntityManagerFactory("www_lab_week2_20009931_NguyenHooangThai");
    }
    public static ConnectDb getInstance() {
        if(instance == null)
            instance = new ConnectDb();
        return instance;
    }
    public EntityManagerFactory getEmf() {
        return emf;
    }
}
