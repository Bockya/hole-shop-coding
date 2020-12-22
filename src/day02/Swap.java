package day02;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        System.out.println("원래 a: " + a + ", b: " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("바뀐 후 a: " + a + ", b: " + b);
    }
}
