package com.mycompany.mavenproject1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej4 {
    public static void main (String [] args)throws StringIndexOutOfBoundsException{
        JFrame ventana = new JFrame("Formulario Alta");
        JLabel labelName = new JLabel("Nombre");
        JLabel labelMail = new JLabel("email");
        JLabel labelPass = new JLabel("Constrasenha");
        JLabel labelRpass = new JLabel("Repite Contrasenha");
        JTextField fieldName = new JTextField(10);
        JTextField fieldMail = new JTextField(10);
        JPasswordField fieldPass = new JPasswordField();
        JPasswordField fieldRpass = new JPasswordField();
        fieldName.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                try {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        for(int i=0;i < fieldName.getText().length() ;i++) {
                            if (fieldName.getText().charAt(0) != fieldName.getText().toUpperCase().charAt(0)) {
                                JOptionPane.showMessageDialog(ventana, "Campo no valido");
                                break;
                            }
                            else if (fieldName.getText().equals(fieldName.getText().replace(" ",""))){
                                    JOptionPane.showMessageDialog(ventana, "Campo no valido");
                                    break;
                            }
                            else if (fieldName.getText().charAt(i)== ' '){
                                if(fieldName.getText().charAt(i+1)!= fieldName.getText().toUpperCase().charAt(i+1)){
                                    JOptionPane.showMessageDialog(ventana, "Campo no valido");
                                    break;
                                }
                            }
                        }
                    }
                } catch (IndexOutOfBoundsException i){
                    JOptionPane.showMessageDialog(ventana, "Campo vacio");
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        fieldMail.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent u) {
                try{
                    Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
                    Matcher mather = pattern.matcher(fieldMail.getText());
                    
                if (u.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (mather.find() == false) {
                        JOptionPane.showMessageDialog(ventana, "Campo no valido");
                    }
                }
                }
                catch (IndexOutOfBoundsException i){
                    JOptionPane.showMessageDialog(ventana, "Campo vacio");
                }
            }
            @Override
            public void keyReleased(KeyEvent keyEvent) {

                }
            });
        fieldPass.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent o) {
                if (o.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (fieldPass.getPassword().length < 8) {
                        JOptionPane.showMessageDialog(ventana, "La contrasenha es demasiado corta ");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });
        fieldRpass.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent keyEvent) {

            }

            @Override
            public void keyPressed(KeyEvent i) {
             try{
                if (i.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!fieldPass.getText().equals(fieldRpass.getText())) {
                        JOptionPane.showMessageDialog(ventana, "Las contrasenhas no coinciden");
                    }
                }
             }
                catch (IndexOutOfBoundsException e){
                    JOptionPane.showMessageDialog(ventana, "Campo vacio");
                }
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {

            }
        });

        ventana.setSize(300,150);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        ventana.setLayout(new GridLayout(4,2));
        ventana.getContentPane().add(labelName);
        ventana.getContentPane().add(fieldName);
        ventana.getContentPane().add(labelMail);
        ventana.getContentPane().add(fieldMail);
        ventana.getContentPane().add(labelPass);
        ventana.getContentPane().add(fieldPass);
        ventana.getContentPane().add(labelRpass);
        ventana.getContentPane().add(fieldRpass);

    }
}
