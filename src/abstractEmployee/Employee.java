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

    public Employee(String empno, String name, int pay) {
        this.empno = empno;
        this.name = name;
        this.pay = pay;
    }
}
