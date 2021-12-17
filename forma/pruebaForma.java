package forma;

public class pruebaForma {
    public static void main (String [] args){
        Forma t1= new triangulo();
        Forma r1= new rectangulo();
        System.out.println(t1);
        System.out.println("Area es: "+t1.getArea());
        System.out.println(r1);
        System.out.println("Area es: "+r1.getArea());
    }
}
