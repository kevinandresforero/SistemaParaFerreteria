package Entorno;

import javax.swing.JFrame;

public class Ventana extends JFrame{
	
	
	
	int Alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width; ; 
	int Ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	
	public Ventana(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Sistema Para Ferretería");
		setSize(Alto , Ancho);
		setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        System.out.println("Haz creado una Ventana de altura "+Alto+" Y de anchura "+Ancho);
		
	}

}

