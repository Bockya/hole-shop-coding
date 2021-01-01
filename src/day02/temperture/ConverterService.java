package day02.temperture;

class ConverterService {
    /*
    1. 섭씨 -> 화씨
        1. 섭씨를 입력받는다
        2. 섭씨를 화씨로 변환한다
            Fahrenheit = (celsius × 1.8) + 32
        3. 변환된 화씨를 출력한다
    2. 화씨 -> 섭씨
        1. 화씨를 입력받는다
        2. 화씨를 섭씨로 변환한다
            Celsius = (fahrenheit - 32) ÷ 1.8
        3. 변환된 섭씨를 출력한다
     */

    double convertCelToFah(double c) {
        return (c * 1.8) + 32;
    }

    double convertFahToCel(double f) {
        return (f - 32) / 1.8;
    }
}
