package Empleados;

public class Vendedor extends Empleado{
    protected String matricula;
    protected String marca;
    protected String modelo;
    protected String telefono_movil;
    protected String area_de_venta;
    protected String lista_de_clientes;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, String telefono,
                    int antiguedad, double salario,String matricula,String marca,String modelo,
                    String telefono_movil,String area_de_venta,String lista_de_clientes) {
        super(nombre, apellidos, dni, direccion, telefono, antiguedad, salario);
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.telefono_movil=telefono_movil;
        this.area_de_venta=area_de_venta;
        this.lista_de_clientes=lista_de_clientes;

    }

    @Override
    public void imprimir() {
        super.imprimir();
    }

    @Override
    public void incrementar_salario() {
        salario= salario*1.1;
    }
    public void alta(){}
    public void baja(){}
    public void cambiar_coche(String matricula,String marca,String modelo){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
    }
}
