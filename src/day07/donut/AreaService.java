package day07.donut;

class AreaService {
    double calcDonutArea(double r1, double r2) {
        double area1 = calcArea(r1);
        double area2 = calcArea(r2);
        return Math.abs(area1 - area2);
    }

    private double calcArea(double r) {
        return r * r * Math.PI;
    }
}
