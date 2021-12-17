package Relacion1_Tema8;

public class Factura extends Presupuesto {
    final static String Fabricante = "Productos ACME S.L.";
    static int num_factura = 0;

    public Factura() {
        super();
        Presupuesto presupuesto= new Presupuesto();
        num_factura+=1;
    }
    public Factura(String cliente,String descripcion,double importe){
        super(cliente, descripcion, importe);
        num_factura+=+1;
    }
    public double precio_oficial(){
        double precio_oficial=importe*1.21;
        return precio_oficial;
    }
    public void imprimir_factura(){
        System.out.println("--------------");
        System.out.println();
        System.out.println("Factura oficial num: "+num_factura);
        System.out.println("--------------");
        System.out.println("Fabricante: "+Fabricante);
        System.out.println("Cliente: "+cliente);
        System.out.println("Articulos: "+descripcion);
        System.out.println("PVP: "+precio_oficial());
    }
}