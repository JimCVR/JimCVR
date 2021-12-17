package Empleados;

public class Jefe_de_zona extends Empleado {
    protected String despacho;
    protected Vendedor[] vendedores;
    protected Secretario secretario;
    protected String matricula, marca, modelo;
    public Jefe_de_zona(String nombre, String apellidos, String dni, String direccion, String telefono, int antiguedad, double salario, String matricula, String marca, String modelo,String despacho,Vendedor[]vendedores,Secretario secretario) {
        super(nombre, apellidos, dni, direccion, telefono, antiguedad, salario);
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.despacho=despacho;
        this.vendedores=vendedores;
        this.secretario=secretario;
    }
    @Override
    public void incrementar_salario() {
        salario=salario*1.2;
    }

    @Override
    public void imprimir() {
        System.out.println("Datos personales");
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("DNI: "+dni);
        System.out.println("Direccion: "+direccion);
        System.out.println("Telefono: "+telefono);
        System.out.println("Antiguedad: "+antiguedad);
        System.out.println("Salario: "+salario);
        System.out.println("Puesto: Jefe de zona");

    }

    @Override
    public void cambiar_supervisor() {
        System.out.println("Cambiose el supervisor");
    }
    public Vendedor altaVendedor(String nombre, String apellidos, String dni, String direccion, String telefono,
                             int antiguedad, double salario,String matricula,String marca,String modelo,
                             String telefono_movil,String area_de_venta,String lista_de_clientes){
        Vendedor vendedor =  new Vendedor(nombre,apellidos,dni,direccion,telefono,antiguedad,salario,matricula,marca,modelo,telefono_movil,area_de_venta,lista_de_clientes);
        return vendedor;
    }
}
