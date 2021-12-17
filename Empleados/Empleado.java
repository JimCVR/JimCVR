package Empleados;

public class Empleado {
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String direccion;
    protected int antiguedad;
    protected String telefono;
    protected double salario;
    public Empleado(String nombre,String apellidos,String dni, String direccion,String telefono,int antiguedad,double salario){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.direccion=direccion;
        this.telefono=telefono;
        this.antiguedad=antiguedad;
        this.salario=salario;
    }
    public void cambiar_supervisor(){}
    public void imprimir(){}
    public void incrementar_salario(){}
}

