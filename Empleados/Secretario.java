package Empleados;

public class Secretario extends Empleado {
    protected String despacho;
    protected String fax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, String telefono, int antiguedad, double salario,String despacho,String fax) {
        super(nombre, apellidos, dni, direccion, telefono, antiguedad, salario);
        this.despacho=despacho;
        this.fax=fax;
    }

    @Override
    public void imprimir() {
        System.out.println("");
    }

    @Override
    public void incrementar_salario() {
        salario= salario*1.05;
    }
}
