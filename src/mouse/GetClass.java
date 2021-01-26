package mouse;

public class GetClass {
    public static void main(String[] args) {
        Mouse[] arr = new Mouse[2];
        arr[0] = new Mouse();
        arr[1] = new WheelMouse();
        //arr[2] = new OpticalMouse();
        for (Mouse mouse : arr) System.out.println(mouse.getClass());
    }
}
