package Formas;

public class Rectangulo extends Forma {
    protected double lado_menor;
    protected double lado_mayor;
    public void imprimir(){
        System.out.println("Rectangulo");
        System.out.println("Nombre: "+nombre);
        System.out.println("color: "+color);
        System.out.println("centro: "+centro);
        System.out.println("lado mayor: "+lado_mayor);
        System.out.println("lado menor: "+lado_menor);
    }
    public double area(){
        double area = lado_mayor*lado_menor;
        return area;
    }
    public double perimetro(){
        double perimetro = (2*lado_menor)+(2*lado_mayor);
        return perimetro;
    }
    public double cambiarTamanho(double escala){
        double tamanho = area()*escala;
        return tamanho;
    }

}
