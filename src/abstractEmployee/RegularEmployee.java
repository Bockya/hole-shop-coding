package abstractEmployee;

public class RegularEmployee extends Employee {
    private int bonus;
    public RegularEmployee(String empno, String name, int pay, int bonus) {
        super(empno, name, pay); // 코드 절약
        this.bonus = bonus; // 필요한 데이터 추가
    }

    public double getMonthPay() {
        return 0;
    }
}
