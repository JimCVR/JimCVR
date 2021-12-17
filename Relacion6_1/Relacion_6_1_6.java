package Relacion6_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;


import java.io.*;

public class Relacion_6_1_6 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String salir = "";
        String leer = "";

        while (salir.equals ("salir") == false){
            System.out.println("Menú\n" +
                    "-------\n" +
                    "1. Leer una cadena de texto.\n" +
                    "2. Leer un carácter.\n" +
                    "3. Leer un Entero.\n" +
                    "4. Leer un Short.\n" +
                    "5. Leer un Double.\n" +
                    "6. Leer un Float.\n" +
                    "0. Salir");
            leer = br.readLine();
            int opcion = Integer.parseInt(leer);
            switch (opcion) {
                case 1:
                    System.out.println("Introduce cadena");
                    leer = br.readLine();
                   String cadena = leer;
                    System.out.println(cadena);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Introduce un caracter");
                    leer = br.readLine();
                    char caracter = leer.charAt(0);
                    System.out.println(caracter);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Introduce un entero");
                    leer = br.readLine();
                    int entero = Integer.parseInt(leer);
                    System.out.println(entero);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Introduce un Short");
                    leer = br.readLine();
                    short corto = Short.parseShort(leer);
                    System.out.println(corto);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Introduce un Double");
                    leer = br.readLine();
                    double doble = Double.parseDouble(leer);
                    System.out.println(doble);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Introduce un Float");
                    leer = br.readLine();
                    float flotante = Float.parseFloat(leer);
                    System.out.println(flotante);
                    System.out.println();
                    break;
                default: salir = "salir";
                break;
            }
        }
    }
}

/*
* Desarrolla clase que implemente una aplicación que mostrará al usuario el siguiente
menú hasta que el usuario pulse la opción salir, para cada una de las opciones el
programa leerá el tipo de dato indicado comprobará que el tipo es adecuado y lo
mostrará por pantalla:
* */