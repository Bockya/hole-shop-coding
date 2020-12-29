package day06;

class BMIMachine {
    void calculate(float h, float w) {
        System.out.println("비만 지수를 구합니다.");
    }

    public static void main(String[] args) {
        BMIMachine m = new BMIMachine();
        float height = 1.8F;
        float weight = 77F;
        m.calculate(height,weight);
    }
}
