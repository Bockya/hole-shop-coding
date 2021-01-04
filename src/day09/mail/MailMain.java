package day09.mail;

import java.util.Scanner;

public class MailMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MessageUI ui = new MessageUI(scanner);
        ui.doJob();
    }
}
