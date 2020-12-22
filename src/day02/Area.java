package day02;

public class Area {
    public static void main(String[] args) {
        // 재료 반지름 10, 5
        // r1 = 10, r2 = 5
        // 반지름 입력 받기

        int r1 = 10;
        int r2 = 5;

        //10인 경우 넓이
        //area1 = r1 * r1 * 3.14

        double area1 = area(r1);
        System.out.println(area1);

        //5
        // area2 = r2 * r2 * 3.14

        double area2 = area(r2);
        System.out.println(area2);

        //result = area1 - area2
        double result = area1 - area2;

        //음수처리 - abs, if, 삼항연산자
        //조건이 참? 참일 때 결과식 : 거짓일 때
        result = result < 0 ? Math.abs(result) : result;
        System.out.println(result);
    }

    private static double area(int r) {
        return r * r * Math.PI;
    }
}
