package Relacion2_Tema8;

import java.io.*;

public class triangulo extends figura implements imprimir{
    private float altura;
    private float lado;
    @Override
    public float area() {
        float area =lado*altura/2 ;
        return area;
    }

    @Override
    public float perimetro() {
        float perimetro=n_lados*lado;
        return perimetro;
    }

    @Override
    public void imp_pantalla() {
        System.out.println("Atributos");
        System.out.println("-------------");

        System.out.println("private float altura;\n" +
                "    private float lado;");
        System.out.println("-----------------");
        System.out.println("Metodos");
        System.out.println("---------------");
        System.out.println("public float area()\npublic float perimetro()");
    }
    public void guardar_a_fichero(String ruta_fichero) throws IOException {
        FileOutputStream fichero = new FileOutputStream(ruta_fichero,true);
        String elementos = "altura: "+altura+"\nlado: "+lado+"\narea: "+area()+"\nperimetro: "+perimetro();
        for(int i=0; i<elementos.length(); i++) {
            fichero.write( (int) elementos.charAt(i) );
        }

        fichero.close();
    }
}
