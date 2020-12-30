package day07;

import java.util.Scanner;

class Quiz {
    String text;
    Quiz yes;
    Quiz no;

    Quiz(String text) {
        this.text = text;
    }

    Quiz getNext(String answer) {
        Quiz result;
        if (answer.equals("y"))
            result = yes;
        else result = no;
        return result;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "text='" + text + '\'' +
                '}';
    }
}

class QuizMain {
    public static void main(String[] args) {
        Quiz q1 = new Quiz("1");
        Quiz q2 = new Quiz("2");
        Quiz q3 = new Quiz("3");
        Quiz q4 = new Quiz("4");
        Quiz q5 = new Quiz("5");
        Quiz q6 = new Quiz("6");
        Quiz q7 = new Quiz("7");

        q1.yes = q2;
        q1.no = q3;
        q2.yes = q4;
        q2.no = q5;
        q3.yes = q6;
        q3.no = q7;

        Scanner sc = new Scanner(System.in);
        Quiz current = q1;

        while (current != null) {
            System.out.println(current.text);
            String answer = sc.nextLine();
            current = current.getNext(answer);
        }
    }
}
