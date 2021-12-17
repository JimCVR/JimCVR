package Relacion1_Tema8;

public class Ejecutar_empleado {
    public static void main(String [] args){
        Programador w1= new Programador();
        Directivo w2= new Directivo();
        w2.imprimir_nomina();
        w1.pedir_vacaciones();
        w1.pedir_aumento();
        w1.imprimir_nomina();
    }
}
