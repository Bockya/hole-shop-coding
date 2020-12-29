package day06;

class BMIMachine {
    float calculate(float h, float w) {
        //키의 제곱
        float hData = h * h;
        //몸무게 / 키의 제곱
        return w / hData;
    }

    public static void main(String[] args) {
        BMIMachine m = new BMIMachine();
        float height = 1.8F;
        float weight = 77F;
        float index = m.calculate(height, weight);
        System.out.println("비만 지수 : " + index);
    }
}
