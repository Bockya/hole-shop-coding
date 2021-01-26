package abstractEmployee;

public class PartTimeEmployee extends Employee {
    private int workDay;

    public PartTimeEmployee(String empno, String name, int pay, int workDay) {
        super(empno, name, pay);
        this.workDay = workDay;
    }

    public double getMonthPay() {
        return pay * workDay;
    }
}
