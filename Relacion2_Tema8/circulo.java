package Relacion2_Tema8;

public class circulo extends figura {
    private float radio;
    @Override
    public float area() {
        float area= (float) (radio*radio*3.14);
        return area;

    }

    @Override
    public float perimetro() {
        float perimetro= (float) (radio*2*3.14);
        return perimetro;
    }

}
