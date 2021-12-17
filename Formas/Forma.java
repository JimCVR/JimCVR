package Formas;

public abstract class Forma {
    protected String color;
    protected punto centro;
    protected char nombre;
    public abstract void imprimir();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCentro(punto centro) {
        this.centro = centro;
    }
}
