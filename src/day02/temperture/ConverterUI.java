package day02.temperture;

import lombok.ToString;

import java.sql.SQLOutput;
import java.util.Scanner;

@ToString
class ConverterUI {
    ConverterService service;
    Scanner scanner;

    public ConverterUI(ConverterService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    void input() {
        int oper = inputStr("1: 섭씨, 2: 화씨");
        if (oper == 1) {
            double celsius = inputStr("섭씨를 입력하세요");
            double celToFah = service.convertCelToFah(celsius);
            System.out.println("화씨:" + celToFah);
        }
        if (oper == 2) {
            double fahrenheit = inputStr("화씨를 입력하세요");
            double fahToCel = service.convertFahToCel(fahrenheit);
            System.out.println("섭씨로: " + fahToCel);
        }
    }

    private int inputStr(String s) {
        System.out.println(s);
        return scanner.nextInt();
    }
}
