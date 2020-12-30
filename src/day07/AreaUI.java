package day07;

import java.util.Scanner;

class AreaUI {
    //키보드에서 두 개의 숫자를 입력받음
    void setNums() {
        double r1 = inputNum("1st radius");
        double r2 = inputNum("2nd radius");
    }

    private double inputNum(String s) {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}

class AreaService {
    double calcArea(double radius1, double radius2) {
        double result = 0;
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        AreaUI ui = new AreaUI();
        ui.setNums();
    }
}
