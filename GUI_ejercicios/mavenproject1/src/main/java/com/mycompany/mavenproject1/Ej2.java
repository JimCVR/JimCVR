package com.mycompany.mavenproject1;

import javax.swing.*;
import java.awt.*;
public class Ej2 {
    public static void main(String [] args){
        JFrame ventana = new JFrame("Adivina el numero");
        JOptionPane dialogos = new JOptionPane();
        double doble = Math.random()*100+1;
        int numero = (int)doble;
        int input=0;
        do {
            input = Integer.parseInt(dialogos.showInputDialog(ventana, "Adivina el numero que estoy pensando\nIntroduce un numero del 1 al 100"));

            if (input == numero) {
                dialogos.showMessageDialog(ventana, "Enhorabuena, has acertado");
            }
            else if (input < numero){
                dialogos.showMessageDialog(ventana, "Tu numero es menor que el mio\nSigue intentandolo");
            }
            else if (input > numero){
                dialogos.showMessageDialog(ventana, "Tu numero es mayor que el mio\nSigue intentandolo");

            }
        } while(input!= numero);
    }
}
/*
* Crea una aplicación que piense un número entre el 1 y el 100 y te rete a adivinarlo.
Irá diciendo si el número pensado es mayor o menor que el que el usuario a dicho,
hasta que acierte.
Implementa toda la interación mediante cuadros de diálogo modales:
•JOptionPane.showMessageDialog(...)
•JOptionPane.showInputDialog(...)
*
* */