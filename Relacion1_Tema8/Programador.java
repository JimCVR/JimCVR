package Relacion1_Tema8;

public class Programador extends Empleado {
    public Programador(){
        super();
        super.DNI="46791354M";
        super.Nombre="Tio";
        super.Apellidos="Plato";
        super.Fecha_de_contrato="";
        super.sueldo_base=2000.0;
        super.base_horas_extra=10.0;
        super.num_horas_extra=20;
    }
    public Programador(String Fecha_de_contrato,double sueldo_base,double base_horas_extra,int num_horas_extra){
        this.Fecha_de_contrato=Fecha_de_contrato;
        this.sueldo_base=sueldo_base;
        this.base_horas_extra=base_horas_extra;
        this.num_horas_extra=num_horas_extra;
    }
    public String pedir_vacaciones(){
        return "Hay que llegar a la siguiente entrega como sea, hasta entonces nadie puede coger vacaciones";
    }
    public String pedir_aumento(){
        return "El jefe de departamento está de vacaciones inténtelo de nuevo cuando vuelva";
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
        System.out.println("Sueldo: "+calcular_sueldo());
    }
}
