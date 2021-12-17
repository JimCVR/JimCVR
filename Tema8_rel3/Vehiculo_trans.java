package Tema8_rel3;

public class Vehiculo_trans extends Vehiculo{
    protected int plazas;
    public Vehiculo_trans(){
        super();
        plazas=1;
    }
    public Vehiculo_trans(int plazas,String matricula,int duracion){
        super(matricula,duracion);
        this.plazas=plazas;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public double alquiler() {
        double importe=300;
        return importe;
    }

    @Override
    public void recibo() {
        System.out.println("----------------------");
        System.out.println("Matricula: "+this.matricula);
        System.out.println("----------------------");
        System.out.println("Duracion: "+this.duracion);
        System.out.println("----------------------");
        System.out.println("Plazas: "+this.plazas);
        System.out.println("----------------------");
        System.out.println("importe: "+this.alquiler()+"€");
    }
}
