package day02.temperture;

class ConverterMain {
    public static void main(String[] args) {
        ConverterService service = new ConverterService();
        ConverterUI ui = new ConverterUI(service);
        ui.input();
    }
}
