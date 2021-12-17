package com.mycompany.mavenproject1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Ej3 {
    public static void main (String [] args)throws NumberFormatException{
        JFrame ventana = new JFrame("Calculadora de IMC");
        JLabel eti1 = new JLabel("Introduce peso");
        JLabel eti2 = new JLabel("Introduce altura");
        JLabel eti3 = new JLabel("Tu IMC es ");
        JTextField campo1 = new JTextField(5);
        JTextField campo2 = new JTextField(5);
        JTextField campo3 = new JTextField(5);

        campo2.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        try {
                                double IMC = calculoIMC(campo1.getText(), campo2.getText());
                                campo3.setText(String.format("%.2f", IMC));
                        }
                        catch(NumberFormatException i){
                            JOptionPane.showMessageDialog(ventana, "Campos vacios");
                        }
                    }
                }
                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
            {
            }


        campo3.setEditable(false);


        ventana.setSize(220, 200);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            ventana.setLayout(new FlowLayout());
            ventana.getContentPane().add(eti1);
            ventana.getContentPane().add(campo1);
            ventana.getContentPane().add(eti2);
            ventana.getContentPane().add(campo2);
            ventana.getContentPane().add(eti3);
            ventana.getContentPane().add(campo3);

    }
    public static double calculoIMC(String weight,String height){
        double peso = Double.parseDouble(weight);
        double altura = Double.parseDouble(height);
        double IMC = peso / (altura * altura);
        return IMC;
    }
}
