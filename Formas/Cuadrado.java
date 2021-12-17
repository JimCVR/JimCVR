package Formas;

public class Cuadrado extends Rectangulo{
    protected double lado;
    @Override
    public double area() {
        double area = lado*2;
        return area;
    }

    @Override
    public void imprimir(){
        System.out.println("Cuadrado");
        System.out.println("Nombre: "+nombre);
        System.out.println("color: "+color);
        System.out.println("centro: "+centro);
        System.out.println("lado: "+lado);
    }
    public double perimetro(){
        double perimetro = 4*lado;
        return perimetro;
    }
}
