package day06;

import java.util.Scanner;

class Memo {
    String content;

    public Memo(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Memo{" +
                "content='" + content + '\'' +
                '}';
    }

    public boolean showResult() {
        return this.content.equals("O");
    }
}

class MemoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Memo[] box = new Memo[5];
        int idx = (int) (Math.random() * box.length);
        for (int i = 0; i < box.length; i++) {
            box[i] = (idx == i) ? new Memo("X") : new Memo("O");
        }
        for (Memo memo : box) {
            System.out.println("마음의 준비를 하고 Enter!");
            sc.nextLine();
            if (memo.showResult())
                System.out.println("꽝");
            else {
                System.out.println("당첨");
                break;
            }
        }
    }
}
