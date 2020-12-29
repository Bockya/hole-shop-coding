package day06;

class PigSave {
    private int total; //캡슐화

    int getTotal() { //진짜 total값 x, 데이터 복사(copy)
        return total;
    }

    void deposit(int amount) {
        System.out.println("저금통 입금");
        total += amount;
    }

    void withdraw() {
        System.out.println("저금통 배따기");
        total = 0;
    }
}

class PigSaveTest {
    public static void main(String[] args) {
        PigSave save = new PigSave();
        save.deposit(100);
        save.deposit(500);
        int totalMoney = save.getTotal(); //get()를 통한 접근
        System.out.println("총액 : " + totalMoney);
    }
}
