package day07.donutarea;

class DonutAreaMain {
    public static void main(String[] args) {
        DonutAreaService service = new DonutAreaService();
        DonutAreaUI ui = new DonutAreaUI(service);
        ui.setNums();
    }
}
