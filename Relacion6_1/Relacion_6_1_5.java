package Relacion6_1;
import java.io.*;
import java.util.*;
public class Relacion_6_1_5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int salir = 0;
        ArrayList<String> cadenas = new ArrayList<String>();;
        while((salir != -1)) {
            System.out.println("Introduzca cadena");
            String leer = br.readLine();
            cadenas.add(leer);
            System.out.println("Para seguir introduce un numero, para salir introduce -1");
            leer = br.readLine();
            salir = Integer.parseInt(leer);

        }
        for(int i = 0;i<cadenas.size();i++){
            System.out.println(cadenas.get(i));
        }
    }
}
/*
Desarrolla una aplicación que lea de teclado cadenas de texto hasta que se introduzca
-1. Después mostrará por pantalla todas las cadenas que se hayan leído hasta el
momento, cada una en una línea.
*/