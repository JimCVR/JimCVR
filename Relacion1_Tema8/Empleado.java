package Relacion1_Tema8;

public class Empleado extends Persona {
    protected String Fecha_de_contrato;
    protected double sueldo_base;
    protected double base_horas_extra;
    protected int num_horas_extra;
    public Empleado(){
        super();
        Fecha_de_contrato="";
        sueldo_base=0.0;
        base_horas_extra=0.0;
        num_horas_extra=0;
    }
    public Empleado(String Fecha_de_contrato,double sueldo_base,double base_horas_extra,int num_horas_extra,String DNI,String Apellidos,String Nombre){
        super(DNI,Apellidos,Nombre);
        this.Fecha_de_contrato=Fecha_de_contrato;
        this.sueldo_base=sueldo_base;
        this.base_horas_extra=base_horas_extra;
        this.num_horas_extra=num_horas_extra;
    }

    public String getFecha_de_contrato() {
        return Fecha_de_contrato;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public double getBase_horas_extra() {
        return base_horas_extra;
    }

    public int getNum_horas_extra() {
        return num_horas_extra;
    }

    public void setFecha_de_contrato(String fecha_de_contrato) {
        Fecha_de_contrato = fecha_de_contrato;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public void setBase_horas_extra(double base_horas_extra) {
        this.base_horas_extra = base_horas_extra;
    }

    public void setNum_horas_extra(int num_horas_extra) {
        this.num_horas_extra = num_horas_extra;
    }
    public double calcular_sueldo(){
        double sueldo=sueldo_base+(base_horas_extra*num_horas_extra);
        return sueldo;
    }
}
