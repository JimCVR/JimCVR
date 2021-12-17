package Relacion6_1;
import java.io.*;
public class Relacion_6_1_1 {
    private static String leido;
    private static BufferedReader br;
    private static int numero;
    public Relacion_6_1_1() {
        leido="";
        br= new BufferedReader(new InputStreamReader(System.in));
        numero=0;
    }
    public static void introducir_numero()throws Exception{
        try{
        leido=br.readLine();
        numero= Integer.parseInt(leido);
        System.out.println(numero);}
        catch(NumberFormatException | IOException e){
            System.err.println("Error");
        }
    }
    public static void main(String[] args)throws Exception{
        Relacion_6_1_1 n1= new Relacion_6_1_1();
        System.out.println("Introduce un numero");
        introducir_numero();
    }
}
