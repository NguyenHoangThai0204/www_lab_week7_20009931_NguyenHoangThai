package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class Product_image {

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Id
    @Column(name = "image_id")
    private  String   imageId;
    @Column(name = "path")
    private  String path;
    @Column(name = "alternative")
    private  String alternative;

    public Product_image() {

    }

    public Product getProductId() {
        return product;
    }

    @Override
    public String toString() {
        return "Product_image{" +
                "productId=" + product +
                ", imageId=" + imageId +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                '}';
    }

    public Product_image(Product product, String imageId, String path, String alternative) {
        this.product = product;
        this.imageId = imageId;
        this.path = path;
        this.alternative = alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public void setProductId(Product productId) {
        this.product = productId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getImageId() {
        return imageId;
    }

    public String getPath() {
        return path;
    }

    public String getAlternative() {
        return alternative;
    }
}
