package day06;

import java.util.Scanner;

class BMITest {
    public static void main(String[] args) {
        //재료
        Scanner scanner = new Scanner(System.in);

        //로직
        System.out.print("Insert your name: ");
        String name = scanner.nextLine();

        System.out.print("Insert your height(m): ");
        double height = scanner.nextDouble();

        System.out.print("Insert your weight(kg): ");
        double weight = scanner.nextDouble();

        PersonData pd = new PersonData(name, height, weight);
        System.out.println(pd);
        double bmi = pd.calc();
        System.out.println(bmi);
    }
}
