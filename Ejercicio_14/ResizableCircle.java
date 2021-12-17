package Ejercicio_14;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }

    public void resize(int percent){
        this.radius=radius+(radius*percent)/100;
    }
}
