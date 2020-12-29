package day06;

class PigSave {
    int total;

    void deposit(int amount) {
        System.out.println("저금통 입금");
        total += amount;
    }

    void withdraw() {
        System.out.println("저금통 배따기");
    }
}

class PigSaveTest {
    public static void main(String[] args) {
        PigSave save = new PigSave();
        save.deposit(100);
        save.deposit(500);
    }
}
