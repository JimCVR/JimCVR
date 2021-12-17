package Relacion6_1;

import java.io.*;

public class Relacion_6_1_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String leido = "";
        System.out.println("Introduzca numero");
        leido = br.readLine();
        double  numero1 = Double.parseDouble(leido);
        System.out.println("Introduzca numero");
        leido = br.readLine();
        double  numero2 = Double.parseDouble(leido);
        System.out.println("Introduzca numero");
        leido = br.readLine();
        double  numero3 = Double.parseDouble(leido);

        double media = (numero1+numero2+numero3)/3;
        System.out.println("La media es: "+ media);
    }
}
/*Desarrolla una aplicación que lea por pantalla 3 notas con decimales, calcule la media
y las muestre por pantalla.*/