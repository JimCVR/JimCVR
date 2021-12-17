package Relacion1_Tema8;

public class carta_esp extends carta {
    public carta_esp(String palo,int numero){
        super();
        if(palo=="Oros" || palo=="Espadas" || palo=="Copas" || palo=="Bastos"){
            this.palo=palo;
        }else{
            System.err.println("Palo no valido");
        }
        if(numero <=10 && numero > 0){
            this.numero=numero;
        }else{
            System.err.println("Numero no valido");
        }
    }

    @Override
    public void mostrar_carta() {
        if(numero<8){
            System.out.println("La carta es el "+numero+" de "+palo);
        }
        else if(numero==8){
            System.out.println("La carta es la Sota de "+palo);
        }
        else if(numero==9){
            System.out.println("La carta es el Caballo de "+palo);
        }
        else if(numero==10){
            System.out.println("La carta es el Rey de "+palo);
        }
    }
}
