package Relacion1_Tema8;

public class Presupuesto {
    protected String cliente;
    protected String descripcion;
    protected double importe;
    public Presupuesto(){
        cliente="";
        descripcion="";
        importe=0.0;
    }
    public Presupuesto(String cliente,String descripcion,double importe){
        this.cliente=cliente;
        this.descripcion=descripcion;
        this.importe=importe;
    }

    public double getImporte() {
        return importe;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    final public void imprimir_presupuesto(){
        System.out.println("--------------");
        System.out.println();
        System.out.println("Presupuesto no oficial");
        System.out.println("--------------");
        System.out.println("Cliente: "+cliente);
        System.out.println("Articulos: "+descripcion);
        System.out.println("Importe: "+importe);
    }
}
