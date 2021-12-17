package forma;

public class rectangulo implements Forma {
    int longitud;
    int ancho;

    @Override
    public double getArea() {

        double area = ancho * longitud;
        return area;
    }

    public String toString() {
        return "triangulo{" +
                "longitud=" + longitud +
                ", ancho=" + ancho +
                '}';
    }
}