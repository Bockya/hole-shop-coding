package day06;

public class BokBulBok {
    private char[] items;
    private int nextIndex = 0;

    void ready() {
        items = new char[5];
        //복불복 당첨 인덱스 번호
        int index = (int) (Math.random() * items.length);
        for (int i = 0; i < items.length; i++) {
            if (i == index) {
                items[i] = 'X';
                continue;
            }
            items[i] = 'O';
        }
    }

    char selectOne() {
        return items[nextIndex++];
    }
}

class BokBulBokTest {
    public static void main(String[] args) {
        BokBulBok bok = new BokBulBok();

        //복불복 기계 안에 준비 작업
        bok.ready();

        //결과 5번 중에 하나는 x
        for (int i = 0; i < 5; i++) {
            char result = bok.selectOne();
            System.out.println(i + "번째: " + result);
        }
    }
}