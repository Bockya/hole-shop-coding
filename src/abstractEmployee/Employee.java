package abstractEmployee;

public abstract class Employee {
    protected String empno;
    protected String name;
    protected int pay;

    public abstract double getMonthPay();

    @Override
    public String toString() {
        return "Employee{" +
                "empno='" + empno + '\'' +
                ", name='" + name + '\'' +
                ", pay=" + pay +
                '}';
    }
}
