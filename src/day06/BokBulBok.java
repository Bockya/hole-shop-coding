package day06;

public class BokBulBok {
    private char[] items;
    private int nextIndex = 0;

    void ready() {
        items = new char[10];
        //복불복 당첨 인덱스 번호
        int index = (int) (Math.random() * items.length);
        for (int i = 0; i < items.length; i++) {
            if (i == index){
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
