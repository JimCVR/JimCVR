package actividad2;

public class circulo {
    protected double radio;
    protected String color;
    public circulo(){
        super();
        radio = 1.0;
        color = "rojo";
    }
    public circulo(double radio){
        this.radio = radio;
    }
    public circulo(double radio, String color){
        this.radio = radio;
        this.color = color;
    }
    //GETTER Y SETTER
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
    public double getArea(){
        double area = radio*(3.14*3.14);
        return area;
    }
}
