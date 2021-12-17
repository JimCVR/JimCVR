package InterfazComparable;

import java.util.*;

public class PruebaBotella{
    public static void main (String [] args){
        Botella [] botellas = new Botella[3];
        botellas[0]= new Botella(1000);
        botellas[1]= new Botella(500);
        botellas[2]= new Botella(2000);
        Arrays.sort(botellas);
        for (int i =0;i< botellas.length;i++){
            System.out.println(botellas[i].getCapacidad());

        }
    }
}
