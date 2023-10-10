package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.services;

import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Product;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories.ProductRepository;

import java.util.List;

public class ProductService {
    private ProductRepository repository;
    public ProductService(){
        this.repository = new ProductRepository();
    }
    public List<Product> getAllPro(){
        return repository.getAllPro();
    }
}
