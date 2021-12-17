package Relacion1_Tema8;

public class carta {
    String palo;
    int numero;
    public carta(){
        palo="";
        numero=0;
    }
    public carta(String palo, int numero){
        this.palo=palo;
        this.numero=numero;
    }
    public carta(final carta c){
        palo=c.palo;
        numero=c.numero;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    public void mostrar_carta(){
        System.out.println("La carta es el "+numero+" de "+palo);
    }
}
