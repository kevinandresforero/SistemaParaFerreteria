package Entorno;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

public class Dibujar {
	public Dibujar(Graphics g, Image Imagen, int PosX, int PosY, int Ancho, int Alto) {
		g.drawImage(Imagen, PosX, PosY, Ancho, Alto,(ImageObserver) this);
		
	}
}
