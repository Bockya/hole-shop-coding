package day06;

class PersonData {
    String name;
    double height;
    double weight;

    public PersonData(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "PersonData{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    double calc() {
        return this.weight / (this.height * this.height);
    }
}
