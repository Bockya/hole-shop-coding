package day02;

import java.util.Scanner;

public class Temperture {
    /*
    1. 섭씨 -> 화씨
        1. 섭씨를 입력받는다
        2. 섭씨를 화씨로 변환한다
        (섭씨온도 × 1.8) + 32 = 화씨온도
        3. 변환된 화씨를 출력한다
    2. 화씨 -> 섭씨
        1. 화씨를 입력받는다
        2. 화씨를 섭씨로 변환한다
        (화씨온도 - 32) ÷ 1.8 = 섭씨온도
        3. 변환된 섭씨를 출력한다
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 : 섭씨 -> 화씨, 2 : 화씨 -> 섭씨");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("섭씨를 입력하세요");
            double celsius = scanner.nextDouble();
            double F = (celsius * 1.8) + 32;
            System.out.println(F);
        }

        if (choice == 2) {
            System.out.println("화씨를 입력하세요");
            double Fahrenheit = scanner.nextDouble();
            double C = (Fahrenheit - 32) / 1.8;
            System.out.println(C);
        }
    }

}
