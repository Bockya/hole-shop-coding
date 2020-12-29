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
        int totalMoney = save.getTotal(); //total값을 복사해서 totalMoney에 저장
        System.out.println("총액 : " + totalMoney);

        //강제로 변경
        totalMoney = 10000; //저장된 데이터만 수정되고 원래 데이터는 안전
        //PigSave도 변했을까?
        int afterMoney = save.getTotal();
        System.out.println("변경되었나? " + afterMoney);
    }
}
