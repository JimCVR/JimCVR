package Ejercicio_14;

public class TestResizableCircle {
    public static void main(String[]args){
        ResizableCircle rc = new ResizableCircle(1.0);
        System.out.println(rc.getArea());
        System.out.println(rc.getPerimeter());
        rc.resize(20);
        System.out.println(rc.getPerimeter());
    }
}
