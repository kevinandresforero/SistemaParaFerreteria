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

import javax.swing.JFrame;

/**
 *
 * @author Kevin Guaitero <https://github.com/kevinandresforero>
 */
public class Ventana extends JFrame{    
	int Alto = new TamañoPantalla().getAlto();
	int Ancho = new TamañoPantalla().getAncho();
	int EstadoPanel = 1;
	
	public Ventana(){
		IniciarComponentes();
	}

    private void IniciarComponentes() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setTitle("Ut Curo Facilis");
        setSize(Alto , Ancho);
	System.out.println("Haz creado una Ventana de altura "+Alto+" Y de anchura "+Ancho);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        CargarImagen Icono = new CargarImagen("/Recursos/Tienda.jpg");
        setIconImage(Icono.getImagen());
        add(new Fondo());
        setVisible(true);
    }
}
