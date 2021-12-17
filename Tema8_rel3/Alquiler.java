package Tema8_rel3;

import java.io.OutputStreamWriter;

public final class Alquiler implements Datos {
    private Vehiculo [] pedido;
    private String empresa;
    public Alquiler(int numero){
        pedido = new Vehiculo[numero];
        for(int i=0;i<pedido.length;i++){
            pedido[i]= new Vehiculo();
        }
    }
    public double importeTotal(){
        double importeTotal=0.0;
        for(int i=0;i< this.pedido.length;i++){
            importeTotal+=pedido[i].alquiler();
        }
        return importeTotal;
    }
    public double importePos(int numero){
        double importePos=pedido[numero].alquiler();
        return importePos;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Total alquiler: "+this.importeTotal()+"€");
        System.out.println("---------------------------");
        System.out.println("        DETALLE ");
        System.out.println(this.pedido);
    }

    @Override
    public void imprimir(String fichero) {
        
    }
}
