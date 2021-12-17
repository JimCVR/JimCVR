package Relacion2_Tema8;

import java.io.IOException;

public class prueba_figuras {
    public static void main (String[]args) throws IOException {
        triangulo t = new triangulo();
        circulo c = new circulo();
        cuadrado cu = new cuadrado();
        poligono_regular pol = new poligono_regular();
        t.guardar_a_fichero("/home/jaime");
    }
}

