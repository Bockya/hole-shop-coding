package abstractEmployee;

public class TempEmployee extends Employee {
    // 2. 생성자 속 super 생성
    public TempEmployee(String empno, String name, int pay, int hireYear) {
        super(empno, name, pay);
    }

    // 1. 추상클래스 상속받으니깐 오버라이딩부터!
    public double getMonthPay() {
        return 0;
    }
}
