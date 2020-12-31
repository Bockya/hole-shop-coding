package day08.org.bmi.service;

class BMIService {
    double calculate(double height, double weight){
        return weight / (height * height);
    }
}
