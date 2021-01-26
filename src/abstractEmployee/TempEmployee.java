package abstractEmployee;

public class TempEmployee extends Employee {
    // 1. 변수 선언
    private int hireYear;

    // 2. 생성자 속 super 생성
    public TempEmployee(String empno, String name, int pay, int hireYear) {
        super(empno, name, pay);
        this.hireYear = hireYear;
    }

    // 1. 추상클래스 상속받으니깐 오버라이딩부터!
    public double getMonthPay() {
        return pay / (double) 12;
    }
}
