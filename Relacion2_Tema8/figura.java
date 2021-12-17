package Relacion2_Tema8;

public abstract class figura {
    protected String color;
    protected int n_lados;

    public String getColor() {
        return color;
    }

    public int getN_lados() {
        return n_lados;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setN_lados(int n_lados) {
        this.n_lados = n_lados;
    }
    public abstract float area();
    public abstract float perimetro();
    public String dibujar() {
        return "figura{" +
                "color='" + color + '\'' +
                ", n_lados='" + n_lados + '\'' +
                ", area='" + area() + '\'' +
                ", perimetro='" + perimetro() + '\'' +
                '}';
    }
}
