package Tema8_rel3;

public class Coche extends Vehiculo_trans {
    public Coche(){
        super();
    }
    public Coche(int duracion,String matricula,int plazas){
        super(plazas, matricula, duracion);
    }

    @Override
    public void recibo() {
        System.out.println("------------");
        System.out.println("   COCHE");
        System.out.println("------------");
        super.recibo();
    }

    @Override
    public double alquiler() {
        double importe= 50*duracion+(1.5*plazas*duracion);
        return importe;
    }
}
