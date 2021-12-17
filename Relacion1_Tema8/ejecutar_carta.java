package Relacion1_Tema8;

public class ejecutar_carta {
    public static void main (String[]args){
        carta c1= new carta();
        carta c2= new carta_esp("Copas",5);
        carta c3= new carta_fra("Picas",2);
        c1.mostrar_carta();
        c2.mostrar_carta();
        c3.mostrar_carta();

         c1= new carta_esp("Oros",8);
         c2= new carta_fra("Treboles",3);
         c3= new carta();
        c1.mostrar_carta();
        c2.mostrar_carta();
        c3.mostrar_carta();
    }
}
