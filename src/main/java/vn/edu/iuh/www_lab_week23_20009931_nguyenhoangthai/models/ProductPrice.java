package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "prouct_price")
public class ProductPrice {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private  Product productId;

    @Id
    @Column(name = "price_date")
    private Date priceDateTime;
    @Column(name = "price")
    private  double price;
    @Column(name = "note")
    private  String note;

    public ProductPrice() {

    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public void setPriceDateTime(Date priceDateTime) {
        this.priceDateTime = priceDateTime;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "productId=" + productId +
                ", priceDateTime=" + priceDateTime +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }

    public ProductPrice(Product productId, Date priceDateTime, double price, String note) {
        this.productId = productId;
        this.priceDateTime = priceDateTime;
        this.price = price;
        this.note = note;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getPriceDateTime() {
        return priceDateTime;
    }

    public double getPrice() {
        return price;
    }

    public String getNote() {
        return note;
    }

}
