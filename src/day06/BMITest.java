package day06;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Scanner;

@AllArgsConstructor
@ToString
class PersonData {
    String name;
    double height;
    double weight;

    double calc() {
        return this.weight / (this.height * this.height);
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
        System.out.println("비만지수 : " + bmi);
        System.out.println("건강지수 : " + pd.getResult(bmi));
    }
}
