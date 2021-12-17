package Relacion2_Tema8;

public class cuadrado extends figura {
    private float lado;
    @Override
    public float area() {
        float area=lado*lado;
        return area;
    }

    @Override
    public float perimetro() {
        float perimetro=lado*n_lados;
        return perimetro;
    }
}
