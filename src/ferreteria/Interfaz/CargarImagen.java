/*
 * Copyright (C) 2019 Kevin Guaitero <https://github.com/kevinandresforero>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ferreteria.Interfaz;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Kevin Guaitero <https://github.com/kevinandresforero>
 */
class CargarImagen {
 int posX,posY;
    Image imagen; 
    String ubicacionImagen;
    public CargarImagen(String ubicacionImagen) {
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
