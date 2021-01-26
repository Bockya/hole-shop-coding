package abstractEmployee;

public class TempEmployee extends Employee{
    // 1. 추상클래스 상속받으니깐 오버라이딩부터!
    public double getMonthPay(){
        return 0;
    }
}
