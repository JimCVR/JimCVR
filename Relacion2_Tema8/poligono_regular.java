package Relacion2_Tema8;

public class poligono_regular extends poligono {
    private float lado;
    @Override
    public float area(){
        float area= (perimetro()*apotema)/2;
        return area;
    }
    @Override
    public float perimetro(){
        float perimetro=n_lados*lado;
        return perimetro;
    }
}
