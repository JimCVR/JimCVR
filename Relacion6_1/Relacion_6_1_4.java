package Relacion6_1;

import java.io.*;

public class Relacion_6_1_4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce cadena");
        String cadena = br.readLine();
        System.out.println("Introduce posicion");
         String numero = br.readLine();
        int posicion = Integer.parseInt(numero);
        System.out.println(cadena.charAt(posicion));
    }

}

/*
    Desarrolla una aplicación que lea de teclado una cadena de texto y una posición,
    después mostrará el carácter que se encuentra en la posición leída.
    */