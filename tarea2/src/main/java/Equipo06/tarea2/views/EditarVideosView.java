package Equipo06.tarea2.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class EditarVideosView extends JFrame {

	private String editName = "";
	
	// Panel de la aplicacion
	public JPanel contentPane;
	
	public JTextArea textArea;
	
	public EditarVideosView(String name) {
		
		// Anadimos un titulo al programa
		this.editName = name;
		setTitle("Editar" + " " + this.editName);
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 500, 312);
		
		// Indica cuando se cierra la ventana se cierra la aplicacion
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Hace visible la ventana
		setVisible(true);
		
		// Creamos el panel
		contentPane = new JPanel();
		
		// Indicamos el diseno del panel
		contentPane.setLayout(null);
	
	}
}
