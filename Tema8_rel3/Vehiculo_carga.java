package Tema8_rel3;

public class Vehiculo_carga extends Vehiculo {
    protected int tara;
    public Vehiculo_carga(){
        super();
        tara=1;
    }
    public Vehiculo_carga(int tara,String matricula,int duracion){
        super(matricula,duracion);
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    @Override
    public double alquiler() {
        return 0;
    }

    @Override
    public void recibo() {
        System.out.println("----------------------");
        System.out.println("Matricula: "+this.matricula);
        System.out.println("----------------------");
        System.out.println("Duracion: "+this.duracion);
        System.out.println("----------------------");
        System.out.println("Tara: "+this.tara);
        System.out.println("----------------------");
        System.out.println("importe: "+this.alquiler());
    }
}
