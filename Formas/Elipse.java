package Formas;

public class Elipse extends Forma {
    protected double radio_mayor;
    protected double radio_menor;
    @Override
    public void imprimir() {
        System.out.println("Elipse");
        System.out.println("Nombre: "+nombre);
        System.out.println("color: "+color);
        System.out.println("centro: "+centro);
        System.out.println("Radio menor: "+radio_menor);
        System.out.println("Radio menor: "+radio_mayor);
    }
    public double area() {
        double area = 3.14 * (radio_mayor * radio_menor);
        return area;
    }
}
