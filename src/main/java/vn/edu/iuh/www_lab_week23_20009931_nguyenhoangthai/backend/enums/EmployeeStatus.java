package vn.edu.iuh.www_lab_week23_20009931_nguyenhoangthai.backend.enums;

public enum EmployeeStatus {
    IN_ACCTIVE(0),
    ACCTIVE(1),
    TERMINATE(-1);
    private int value;
    EmployeeStatus(int values) {
        this.value = values;
    }
    public int getValue(){return value;}
}
