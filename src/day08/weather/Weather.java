package day08.weather;

public class Weather {
    public int date;
    int rainAmount;
    public double max;
    double min;

    public Weather(int date, double max, double min) {
        this(date, max, min, 0);
    }

    public Weather(int date, double max, double min, int rainAmount) {
        this.date = date;
        this.max = max;
        this.min = min;
        this.rainAmount = rainAmount;
    }

    public int getDailyCross(){
        return (int)(this.max - this.min);
    }
    @Override
    public String toString() {
        return "Weather{" +
                "date=" + date +
                ", rainAmount=" + rainAmount +
                ", max=" + max +
                ", min=" + min +
                '}';
    }
}
