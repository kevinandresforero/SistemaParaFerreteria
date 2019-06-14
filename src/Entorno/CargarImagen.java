package Entorno;

import java.awt.Image;
import javax.swing.ImageIcon;
/*
 * Esta clase me permite cargar imagenes en objetos Image
 */

public class CargarImagen {
    int posX,posY;
    Image imagen; 
    String ubicacionImagen;
    public CargarImagen(String ubicacionImagen){
        this.ubicacionImagen = ubicacionImagen;
        try {
        	ImageIcon img = new ImageIcon(this.getClass().getResource(this.ubicacionImagen));
        	this.imagen = img.getImage();
        	System.out.println("se pudo cargar correctamente la imagen de la ruta "+this.ubicacionImagen);
		} catch (Exception e) {
			System.out.println("No se pudo cargar correctamente la imagen de la ruta "+this.ubicacionImagen);
		}
        	
    }

    public Image getImagen() {
        return imagen;
    }


    public void setImagen(String ubicacionImagen) {
        this.ubicacionImagen = ubicacionImagen;
        ImageIcon img = new ImageIcon(this.getClass().getResource(ubicacionImagen));
        this.imagen = img.getImage();
    }
    
}
