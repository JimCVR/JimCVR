package Ejercicio_14;

public class Circle implements GeometricObject{
    protected double radius;
    public Circle(){
        radius=1.0;
    }
    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getPerimeter() {
        double perimeter=(radius*2*3.14);
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = radius*radius*3.14;
        return area;
    }
}
