package Entorno;

import javax.swing.JFrame;

public class Ventana extends JFrame{	
	
	int Alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	int Ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	int EstadoPanel = 1;
	Fondo Fondo;
	
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
                CargarImagen Icono = new CargarImagen("/Recursos/MartilloPorra.png");
                setIconImage(Icono.getImagen());
	}
}