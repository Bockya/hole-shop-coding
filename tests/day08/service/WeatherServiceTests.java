package day08.service;

import day08.weather.Weather;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeatherServiceTests {
    WeatherService service;

    @BeforeEach
    void setUp() {
        Weather[] arr = new Weather[31];
        arr[0] = new Weather(1, 40, 28);
        arr[1] = new Weather(2, 38, 30);
        arr[2] = new Weather(3, 38, 30);
        arr[3] = new Weather(4, 35, 28);
        arr[4] = new Weather(5, 34, 27, 2);
        arr[5] = new Weather(6, 35, 28, 7);
        arr[6] = new Weather(7, 36, 27);
        arr[7] = new Weather(8, 35, 28);
        arr[8] = new Weather(9, 33, 27, 2);
        arr[9] = new Weather(10, 37, 26);
        arr[10] = new Weather(11, 36, 26);
        arr[11] = new Weather(12, 35, 27, 5);
        arr[12] = new Weather(13, 34, 27, 1);
        arr[13] = new Weather(14, 37, 28);
        arr[14] = new Weather(15, 37, 28, 1);
        arr[15] = new Weather(16, 38, 28);
        arr[16] = new Weather(17, 36, 24);
        arr[17] = new Weather(18, 34, 22);
        arr[18] = new Weather(19, 32, 22);
        arr[19] = new Weather(20, 34, 23);
        arr[20] = new Weather(21, 31, 23, 5);
        arr[21] = new Weather(22, 38, 23);
        arr[22] = new Weather(23, 32, 26, 3);
        arr[23] = new Weather(24, 26, 23, 8);
        arr[24] = new Weather(25, 29, 23);
        arr[25] = new Weather(26, 29, 20, 2);
        arr[26] = new Weather(27, 25, 20, 20);
        arr[27] = new Weather(28, 26, 23, 97);
        arr[28] = new Weather(29, 27, 23, 42);
        arr[29] = new Weather(30, 28, 24, 10);
        arr[30] = new Weather(31, 30, 23);

        service = new WeatherService(arr);
    }

    @Test
    void test() {
        Weather weather = service.getHighestWeather();
        System.out.println(weather);
    }
    @Test
    void test2() {
        Weather weather = service.getHichestDailyCross();
        System.out.println(weather);
    }
    @Test
    void test3() {
        Weather weather = service.getDateWeather(15);
        System.out.println(weather);
    }

}