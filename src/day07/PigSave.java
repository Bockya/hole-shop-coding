package day07;

import java.util.Scanner;

class PigSave {
    private int total; //캡슐화

    int getTotal() { //진짜 total값 x, 데이터 복사(copy)
        return total;
    }

    void deposit(int amount) {
        //System.out.println("저금통 입금");
        total += amount;
    }

    int withdraw() {
        //System.out.println("저금통 배따기");
        int result = total;
        total = 0;
        return result;
    }
}

class PigSaveUI {
    Scanner scanner; //공유
    PigSave save; //조력자, 의존성

    public PigSaveUI() {
        scanner = new Scanner(System.in);
        save = new PigSave();
    }

    void Init() {
        while (true) {
            System.out.println("입금 1, 출금 2, 총액 3");
            int oper = scanner.nextInt();

            if (oper == 1)
                inputDeposit();
            else if (oper == 2)
                confirmWithdraw();
            else if (oper == 3)
                checkTotal();
            else System.out.println("다시 입력하세요");
        }
    }

    private void inputDeposit() {
        System.out.print("입금: ");
        int money = scanner.nextInt();
        save.deposit(money);

    }

    private void confirmWithdraw() {
        System.out.println("진짜 배 따실려고? (y or n)");
        String oper = scanner.next();
        if (oper.equals("y")) {
            int total = save.withdraw();
            System.out.println("출금: " + total);
        }
    }

    private void checkTotal() {
        int totalMoney = save.getTotal(); //total값을 복사해서 totalMoney에 저장
        System.out.println("총액: " + totalMoney);
    }
}

class PigSaveTest {
    public static void main(String[] args) {
        PigSaveUI ui = new PigSaveUI();
        ui.Init();
    }
}
