package forma;

public class triangulo implements Forma {
    int base;
    int altura;
    public double getArea(){
        double area= (base*altura)/2;
        return area;
    }

    @Override
    public String toString() {
        return "triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
