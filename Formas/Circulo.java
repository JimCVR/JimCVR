package Formas;

public class Circulo extends Elipse{
    protected double radio;
    @Override
    public void imprimir() {
        System.out.println("Elipse");
        System.out.println("Nombre: "+nombre);
        System.out.println("color: "+color);
        System.out.println("centro: "+centro);
        System.out.println("Radio: "+radio);
        }
    public double area() {
        double area = 3.14 * (radio*radio);
        return area;
    }
}
