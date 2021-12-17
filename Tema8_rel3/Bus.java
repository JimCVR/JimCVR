package Tema8_rel3;

public class Bus extends Vehiculo_trans {
    public Bus(){
        super();
    }
    public Bus(int duracion,String matricula,int plazas){
        super(plazas, matricula, duracion);
    }
    @Override
    public void recibo() {
        System.out.println("------------");
        System.out.println("   BUS");
        System.out.println("------------");
        super.recibo();
    }
    @Override
    public double alquiler() {
        double importe= 50*duracion+(1.5*plazas*duracion+2*plazas);
        return importe;
    }
}
