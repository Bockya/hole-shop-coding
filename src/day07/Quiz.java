package day07;

import lombok.ToString;

import java.util.Scanner;

@ToString
class Quiz {
    int num;
    Quiz yes;
    Quiz no;

    Quiz(int num) {
        this.num = num;
    }

    Quiz getNext(String answer) {
        Quiz result;
        if (answer.equals("y"))
            result = yes;
        else result = no;
        return result;
    }
}

class QuizMain {
    public static void main(String[] args) {
        Quiz[] quizArr = new Quiz[7];
        for (int i = 0; i < quizArr.length; i++) {
            quizArr[i] = new Quiz(i);
        }

        quizArr[0].yes = quizArr[1];
        quizArr[0].no = quizArr[2];
        quizArr[1].yes = quizArr[3];
        quizArr[1].no = quizArr[4];
        quizArr[2].yes = quizArr[5];
        quizArr[2].no = quizArr[6];

        Scanner sc = new Scanner(System.in);
        Quiz current = quizArr[0];

        while (current != null) {
            System.out.println(current.num);
            String answer = sc.nextLine();
            current = current.getNext(answer);
        }
    }
}
