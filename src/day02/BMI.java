package day02;

import java.util.Scanner;

public class BMI {
    /*
    1. 신장과 키 입력 받기
    2. BMI 계산하기
        BMI = 몸무게(kg) / (키(m) * 키(m))
        1. 비만 (25 이상)
        2. 과체중 (23 이상 25 미만)
        3. 정상 (18.5 이상 23 미만)
        4. 저체중 (나머지)
    3. BMI 지수 따른 비만도 결과 출력하기
     */
    double height, weight, BMI;

    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.enterHeightWeight();
        System.out.println("비만도 결과: " + bmi.calculateBMI(bmi.weight, bmi.height));
    }

    private String calculateBMI(double w, double h) {
        BMI = w / (h * h);
        System.out.println("BMI 지수: " + BMI);
        if (BMI >= 25) return "비만";
        else if (BMI >= 23) return "과체중";
        else if (BMI >= 18.5) return "정상";
        else return "저체중";
    }

    private void enterHeightWeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("키(cm)를 입력하세요");
        height = sc.nextDouble();
        height /= 100;
        System.out.println("몸무게(kg)를 입력하세요");
        weight = sc.nextDouble();
        //calculateBMI(weight, height);
    }
}
