package Relacion1_Tema8;

public class ejecutar_Factura {
    public static void main(String [] args){
       Factura f1= new Factura("jaime","pan",1.0);
        f1.imprimir_factura();
        Factura f2= new Factura("marta","leche",1.4);

        f2.imprimir_factura();
    }
}
