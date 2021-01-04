package day09.mail;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Scanner;
@AllArgsConstructor
@ToString
class MessageUI { //고객이랑 입출력
    Scanner scanner;
    void doJob() {
        System.out.println("누구에게");
        String to = scanner.nextLine();
        System.out.println("제목은");
        String title = scanner.nextLine();
        System.out.println("내용은");
        String content = scanner.nextLine();
    }
}
