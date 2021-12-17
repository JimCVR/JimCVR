/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RelacionGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author jaimecaro
 */
public class Ej5 {
    public static void main (String [] args)throws NumberFormatException{
        JFrame ventana = new JFrame("Calculadora");
        JTextField numero1 = new JTextField(5);
        JTextField numero2 = new JTextField(5);
        JTextField numero3 = new JTextField(5);
        JButton sumar = new JButton("+");
        JButton restar = new JButton("-");
        JButton producto = new JButton("X");
        JButton cociente = new JButton("/");
        JLabel resultado = new JLabel("Resultado");
        
	sumar.addActionListener(new ActionListener(){

	    @Override
	    public void actionPerformed(ActionEvent e) {
		try {
		    if(e.getSource()== sumar){
			String resultado = sumatorio(numero1.getText(),numero2.getText());
			numero3.setText(resultado);
		    }
		}
		catch(NumberFormatException i){
		    JOptionPane.showMessageDialog(ventana, "Error ");
		}
	    }
	    
	});
	restar.addActionListener(new ActionListener(){

	    @Override
	    public void actionPerformed(ActionEvent e) {
		try {
		    if(e.getSource()== restar){
			String resultado = resta(numero1.getText(),numero2.getText());
			numero3.setText(resultado);
		    }
		}
		catch(NumberFormatException i){
		    JOptionPane.showMessageDialog(ventana, "Error ");
		}
	    }
	    
	});
	producto.addActionListener(new ActionListener(){

	    @Override
	    public void actionPerformed(ActionEvent e) {
		try {
		    if(e.getSource()== producto){
			String resultado = multiplicacion(numero1.getText(),numero2.getText());
			numero3.setText(resultado);
		    }
		}
		catch(NumberFormatException i){
		    JOptionPane.showMessageDialog(ventana, "Error ");
		}
	    }
	    
	});
	cociente.addActionListener(new ActionListener(){

	    @Override
	    public void actionPerformed(ActionEvent e) {
		try {
		    if(e.getSource()== cociente){
			String resultado = division(numero1.getText(),numero2.getText());
			numero3.setText(resultado);
		    }
		}
		catch(NumberFormatException i){
		    JOptionPane.showMessageDialog(ventana, "Error ");
		}
	    }
	    
	});
        ventana.setSize(300,100);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());
        
	ventana.getContentPane().add(numero1);
        ventana.getContentPane().add(numero2);
        ventana.getContentPane().add(resultado);
        ventana.getContentPane().add(numero3);
        ventana.getContentPane().add(sumar);
        ventana.getContentPane().add(restar);
        ventana.getContentPane().add(producto);
        ventana.getContentPane().add(cociente);
    
    
}
    public static String sumatorio(String numero1,String numero2){
	
	double dato1 = Double.parseDouble(numero1);
	double dato2 = Double.parseDouble(numero2);
	double resultado = dato1+dato2;
	String res = resultado+"";
	return res;
    }
    public static String resta(String numero1,String numero2){
	
	double dato1 = Double.parseDouble(numero1);
	double dato2 = Double.parseDouble(numero2);
	double resultado = dato1-dato2;
	String res = resultado+"";
	return res;
    }
    public static String multiplicacion(String numero1,String numero2){
	
	double dato1 = Double.parseDouble(numero1);
	double dato2 = Double.parseDouble(numero2);
	double resultado = dato1*dato2;
	String res = resultado+"";
	return res;
    }
    public static String division(String numero1,String numero2){
	
	double dato1 = Double.parseDouble(numero1);
	double dato2 = Double.parseDouble(numero2);
	double resultado = dato1/dato2;
	String res = resultado+"";
	return res;
    }
}