package day08.bmi.ui;

import day08.bmi.service.BMIService;

import java.util.Scanner;

class BMIUI {
    BMIService service;
    Scanner scanner;

    BMIUI(BMIService service) {
        this.scanner = new Scanner(System.in);
        this.service = service;
    }

    String inputStr(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }

    void input() {
        String name = this.inputStr("본인의 이름");
        double height = Double.parseDouble(inputStr("키(m)를 입력하세요"));
        if (height > 2.5) height = Double.parseDouble(inputStr("m로 다시 입력하세요"));
        double weight = Double.parseDouble(inputStr("몸무게(kg)를 입력하세요"));

        System.out.println(name + ": " + height + "(m), " + weight + "(kg)");
        double bmi = service.calculate(height, weight);
        System.out.println("BMI: " + bmi);
    }
}

class Main {
    public static void main(String[] args) {
        BMIService service = new BMIService();
        BMIUI ui = new BMIUI(service);
        ui.input();
    }
}
