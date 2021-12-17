package Relacion1_Tema8;

public class carta_fra extends carta{
    public carta_fra(String palo,int numero){
        super();
        if(palo=="Picas" || palo=="Rombos" || palo=="Treboles" || palo=="Corazones"){
            this.palo=palo;
        }else{
            System.err.println("Palo no valido");
        }
        if(numero <=13 && numero > 0){
            this.numero=numero;
        }else{
            System.err.println("Numero no valido");
        }

    }
    @Override
    public void mostrar_carta() {
        if(numero<11){
            System.out.println("La carta es el "+numero+" de "+palo);
        }
        else if(numero==11){
            System.out.println("La carta es la Jota de "+palo);
        }
        else if(numero==12){
            System.out.println("La carta es la Reina de "+palo);
        }
        else if(numero==13){
            System.out.println("La carta es el Rey de "+palo);
        }
    }
}
