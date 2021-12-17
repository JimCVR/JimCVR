package Relacion1_Tema8;

public class Directivo extends Empleado {
    protected double plus_direccion;
    protected double dietas;
    protected String cargo;
    public Directivo(){
        super();
        super.DNI="46791354M";
        super.Nombre="Renne";
        super.Apellidos="Bright";
        super.Fecha_de_contrato="";
        super.sueldo_base=2000.0;
        super.base_horas_extra=15.0;
        super.num_horas_extra=30;
        plus_direccion=300.0;
        dietas=100.0;
        cargo="";
    }
    public Directivo(double plus_direccion,double dietas,String cargo){
        this.plus_direccion=plus_direccion;
        this.dietas=dietas;
        this.cargo=cargo;
    }
    @Override
    public double calcular_sueldo(){
        double sueldo=sueldo_base+(base_horas_extra*num_horas_extra)+dietas+plus_direccion;
        return sueldo;
    }
    public void imprimir_nomina(){
        System.out.println("--------------");
        System.out.println();
        System.out.println("NOMINA");
        System.out.println();
        System.out.println("--------------");
        System.out.println();
        System.out.println("DNI: "+DNI);
        System.out.println();
        System.out.println("Nombre: "+Apellidos+","+Nombre);
        System.out.println();
        System.out.println("Cargo: "+cargo);
        System.out.println();
        System.out.println("Sueldo: "+calcular_sueldo());
    }
}
