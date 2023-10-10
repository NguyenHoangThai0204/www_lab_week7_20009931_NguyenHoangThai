package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models.Product;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.repositories.ProductRepository;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.services.ProductService;

import java.util.List;

@Path("/products")
public class ProductResource {
    public ProductService productService;

    public ProductResource(){
        productService = new ProductService();
    }

    @GET
    @Produces("application/json")
    public Response getAll(){
        List<Product> lst = productService.getAllPro();
        return Response.ok(lst).build();
    }

}
