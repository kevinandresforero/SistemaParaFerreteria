package Entorno;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Fondo extends JPanel{
	String Fondo;
	CargarImagen DeFondo;
	Image ImagenFondo;
	
	
	public Image Fondo(int EstadoPanel) {
		DeFondo = new CargarImagen(ValidarEstado(EstadoPanel));
		ImagenFondo = DeFondo.getImagen();
		return ImagenFondo;
	}
	
	private String ValidarEstado(int EstadoPanel){
		if(EstadoPanel == 1) {
			Fondo="/Recursos/Ferreteria.jpg";
		}else {
			Fondo="/Recursos/Ferreteria.jpg";
		}
		return Fondo;
	}
	
	private void Dibujar(Graphics g) {
		g.drawImage(ImagenFondo,0,0,getWidth(), getHeight(),this);
		
	}
	
}
