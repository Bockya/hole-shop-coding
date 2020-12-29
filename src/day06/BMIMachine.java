package day06;

class BMIMachine {
    char getResult(float indexValue) {
        if (indexValue > 30)
            return 'A'; //비만
        else if (indexValue > 24)
            return 'B'; //과체중
        else if (indexValue > 20)
            return 'C'; //정상
        else if (indexValue > 15)
            return 'D'; //저체중
        else if (indexValue > 13)
            return 'E'; //마름
        else if (indexValue > 10)
            return 'F'; //영양실조
        else return 'G'; //소모증

    }

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
        System.out.println("비만지수 : " + index);
        System.out.println("건강지수 : " + m.getResult(index));
    }
}
