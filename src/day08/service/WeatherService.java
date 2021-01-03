package day08.service;

import day08.weather.Weather;

import java.util.Arrays;
import java.util.Comparator;

public class WeatherService {
    Weather[] arr;

    public WeatherService(Weather[] arr) {
        this.arr = arr;
    }

    //가장 높은 온도의 날짜
    Weather getHighestWeather() {
        Arrays.sort(arr, (d1, d2) -> (d1.max - d2.max) > 0 ? -1 : 1);
        return arr[0];
    }

    //일교차가 가장 큰 날
    Weather getHichestDailyCross() {
        Arrays.sort(arr, (d1, d2) -> (d1.getDailyCross() - d2.getDailyCross()) > 0 ? -1 : 1);
        return arr[0];
    }

    //특정한 날짜의 강수량
    Weather getDateWeather(int date) {
        Arrays.sort(arr, Comparator.comparingInt(d -> d.date));
        return arr[date - 1];
    }
}
