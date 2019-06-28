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

/**
 *
 * @author Kevin Guaitero <https://github.com/kevinandresforero>
 */
public class TamañoPantalla {
    int Alto;
    int Ancho;
    public TamañoPantalla() {
        Alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        Ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    }
    
    int getAlto(){
        return Alto;
    }
    
    int getAncho() {
        return Ancho;
    }
}
