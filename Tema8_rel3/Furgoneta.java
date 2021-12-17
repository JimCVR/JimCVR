package Tema8_rel3;

public class Furgoneta extends Vehiculo_carga {
    public Furgoneta(){
        super();
    }
    public Furgoneta(int duracion,String matricula,int tara){
        super(tara, matricula, duracion);
    }
    @Override
    public void recibo() {
        System.out.println("------------");
        System.out.println("   FURGONETA");
        System.out.println("------------");
        super.recibo();
    }
    @Override
    public double alquiler() {
        double importe= 50*duracion+(20*tara);
        return importe;
    }
}
