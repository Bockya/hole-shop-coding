package day07.donut;

class AreaMain {
    public static void main(String[] args) {
        AreaService service = new AreaService();
        AreaUI ui = new AreaUI(service);
        ui.setNums();
    }
}
