package Formas;

public class PruebaRectangulo {
    public static void main (String []args){
        Rectangulo rect= new Rectangulo();
        rect.setColor("Verde");
        rect.setCentro(new punto(5,4));
        rect.area();
        rect.perimetro();
        rect.imprimir();
    }
}
