package day06;

class PigSave {
    int total;

    void deposit() {
        System.out.println("저금통 입금");
    }

    void withdraw() {
        System.out.println("저금통 배따기");
    }
}

class PigSaveTest {
    public static void main(String[] args) {
        PigSave save = new PigSave();
        System.out.println(save);
    }
}
