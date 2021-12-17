package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;

public class Ej1 {
    public static void main(String [] args) {
        JFrame ventana = new JFrame("Calculadora IMC");
        JOptionPane dialogos = new JOptionPane();
        double peso= Double.parseDouble(dialogos.showInputDialog(ventana,"Introduce tu peso"));
        double altura= Double.parseDouble(dialogos.showInputDialog(ventana,"Introduce tu altura"));
        double IMC = peso/(altura*altura);
        dialogos.showMessageDialog(ventana,"Su IMC es: "+IMC);
    }
}
/*
* Realiza una aplicación que pregunte Peso y Altura y muestre el Índice de Masa
Corporal, empleando JOptionPane Implementa la interacción con el usuario mediante diálogos modales:
•JOptionPane.showMessageDialog(...)
•JOptionPane.showInputDialog(...)

* */