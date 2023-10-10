package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.enums;

public enum ProductStatus {
    ACCTIVE(1),
    IN_ACCTIVE(0),
    TERMINATE(-1);
    private int value;
    ProductStatus(int values) {
        this.value = values;
    }
    public int getValue(){return value;}
}
