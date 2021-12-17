package Tema8_rel3;

public class Camion extends Vehiculo_carga{
    public Camion(){
        super();
    }
    public Camion(int duracion,String matricula,int tara){
        super(tara, matricula, duracion);
    }
    @Override
    public void recibo() {
        System.out.println("------------");
        System.out.println("   CAMION");
        System.out.println("------------");
        super.recibo();
    }
    @Override
    public double alquiler() {
        double importe= 50*duracion+(20*tara+40);
        return importe;
    }
}
