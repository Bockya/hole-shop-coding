package abstractEmployee;

public class RegularEmployee extends Employee {
    public RegularEmployee(String empno, String name, int pay, int bonus) {
        super(empno, name, pay);
    }

    public double getMonthPay() {
        return 0;
    }
}
