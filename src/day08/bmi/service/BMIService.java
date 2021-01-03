package day08.bmi.service;

public class BMIService {
    public double calculate(double height, double weight) {
        double result = weight / (height * height);
        result = Math.round(result * 100) / 100.0; //소수점 둘째자리까지 표현
        return result;
    }

    String getResult(double indexValue) {
        if (indexValue > 25)
            return "비만";
        else if (indexValue > 23)
            return "과체중";
        else if (indexValue > 18.5)
            return "정상";
        else return "저체중";
    }
}
