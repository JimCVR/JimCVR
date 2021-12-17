package Tema8_rel3;

public class Vehiculo {
    protected String matricula;
    protected int duracion;
    public Vehiculo(){
        matricula="";
        duracion=1;
    }
    public Vehiculo(String matricula,int duracion){
        this.matricula=matricula;
        this.duracion=duracion;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public double alquiler(){
        double importe=0.0;
        return importe;
    }
    public void recibo(){
        System.out.println("----------------------");
        System.out.println("Matricula: "+this.matricula);
        System.out.println("----------------------");
        System.out.println("Duracion: "+this.duracion);
        System.out.println("----------------------");
        System.out.println("importe: "+this.alquiler());
    }
}
