package day08.bmi.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class BMIServiceTest {
    static BMIService service;

    @BeforeAll //초기화
    static void setUp() {
        System.out.println("setup...");
        service = new BMIService();
    }

    @Test
    void test() {
        System.out.println(service);
        assertNotNull(service); //객체 A가 null이 아님을 확인

    }

    @Test
    void test2() {
        //18.52
        double bmi = service.calculate(1.8, 60);
        System.out.println(bmi);
        assertEquals(bmi, 18.52); //객체 A와 B가 일치함을 확인
    }

    @Test
    void test3(){
        double bmi = service.calculate(1.8, 60);
        String result = service.getResult(bmi);
        System.out.println(result);
        assertEquals(result, "정상");
    }
}