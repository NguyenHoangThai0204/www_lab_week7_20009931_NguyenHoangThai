package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order{

    @Id
    @Column(name = "order_id")
    private long id;

    @Column(name = "order_date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee empId;

    @ManyToOne
    @JoinColumn(name = "cust_id")
    private Customer custId;

    public Order() {
    }
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", empId=" + empId +
                ", custId=" + custId +
                '}';
    }

    public long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Employee getEmpId() {
        return empId;
    }

    public Customer getCustId() {
        return custId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setEmpId(Employee empId) {
        this.empId = empId;
    }

    public void setCustId(Customer custId) {
        this.custId = custId;
    }

    public Order(LocalDate date, Employee empId, Customer custId) {
        this.date = date;
        this.empId = empId;
        this.custId = custId;
    }

}
