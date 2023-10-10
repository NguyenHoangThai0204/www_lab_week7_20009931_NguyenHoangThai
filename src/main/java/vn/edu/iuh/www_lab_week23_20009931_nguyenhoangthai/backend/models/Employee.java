package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.enums.EmployeeStatus;

import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee{
    @Id
    @Column(name = "emp_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "full_name")
    private String full_name;
    @Column(name = "dob")
    @JsonFormat(pattern = "yyyy-MM-dd") // Cấu hình định dạng ngày tháng
    private Date dob;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "status")
    private EmployeeStatus status;

    public Employee() {

    }

    public long getId() {
        return id;
    }

    public String getFull_name() {
        return full_name;
    }

    public Date getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", full_name='" + full_name + '\'' +
                ", dob='" + dob + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                '}';
    }

    public Employee( String full_name, Date dob, String email, String address, EmployeeStatus status) {
        this.full_name = full_name;
        this.dob = dob;
        this.email = email;
        this.address = address;
        this.status = status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

}
