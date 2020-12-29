package day06;

import java.util.Arrays;
import java.util.Comparator;

public class SortEx1 {
    public static void main(String[] args) {
        int[] arr = {34, 42, 64, 31, 56, 98};
        //Comparator<Integer> comp = (a, b) -> b - a; //람다식
        Arrays.sort(arr); //static 메서드
        System.out.println(Arrays.toString(arr));
    }
}
