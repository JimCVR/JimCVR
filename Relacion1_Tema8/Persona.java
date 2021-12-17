package Relacion1_Tema8;

public class Persona {
    protected String Nombre;
    protected String Apellidos;
    protected String DNI;
    public Persona(){
        Nombre="Jaime";
        Apellidos="Cabeza";
        DNI="458241236C";
    }
    public Persona(String Nombre, String Apellidos,String DNI){
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.DNI=DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    public void mostrar_info(){
        System.out.println("DNI: "+DNI);
        System.out.println();
        System.out.println("Nombre: "+Apellidos+","+Nombre);
    }
}
