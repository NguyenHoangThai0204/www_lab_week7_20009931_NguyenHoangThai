package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.models;

import jakarta.persistence.*;

@Entity
@Table(name = "orderdetail")
public class OrderDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private  Order orderId;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    private long quantity;
    private long price;
    @Id
    private Long id;


    public OrderDetail() {

    }

    public Order getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }

    public OrderDetail(Order orderId, Product productId, long quantity, long price, String note) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.note = note;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Product getProductId() {
        return productId;
    }

    public long getQuantity() {
        return quantity;
    }

    public long getPrice() {
        return price;
    }

    public String getNote() {
        return note;
    }

    private String note;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
