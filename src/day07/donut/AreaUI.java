package day07.donut;

import lombok.ToString;

import java.util.Scanner;

@ToString
class AreaUI {
    AreaService service;
    Scanner scanner;

    public AreaUI(AreaService service) {
        this.service = service;
        this.scanner = new Scanner(System.in);
    }

    //키보드에서 두 개의 숫자를 입력받음
    void setNums() {
        double r1 = inputNum("1st radius");
        double r2 = inputNum("2nd radius");
        System.out.println("1st radius: " + r1 + ", 2nd radius: " + r2);
        double donutArea = service.calcDonutArea(r1, r2);
        System.out.println("donutArea: " + donutArea);
    }

    double inputNum(String s) {
        System.out.println(s);
        return scanner.nextDouble();
    }
}