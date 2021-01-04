package day09.mail;

import java.util.Scanner;

public class MailMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MailSender sender = new MailSender();
        MessageUI ui = new MessageUI(scanner, sender);
        ui.doJob();
    }
}
