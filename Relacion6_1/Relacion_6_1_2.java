package Relacion6_1;

import java.io.*;

public class Relacion_6_1_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String salir = "no";
        while(salir.equals("no")) {
        String leido = "";
        System.out.println("Introduzca cadena");
        leido = br.readLine();
        System.out.println(leido);
        System.out.println("¿Salir? salir/no");
            leido = br.readLine();
            salir = leido;
        }
    }
}
