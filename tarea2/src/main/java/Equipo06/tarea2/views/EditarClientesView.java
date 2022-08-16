package Equipo06.tarea2.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class EditarClientesView extends JFrame {

	private String editName = "";
	
	// Panel de la aplicacion
	public JPanel contentPane;
	
	public JTextArea textArea;
	
	public EditarClientesView(String name) {
		
		// Anadimos un titulo al programa
		this.editName = name;
		setTitle("Ver" + " " + this.editName);
		
		// Coordenadas x y  de la aplicacion
		setBounds(400, 200, 500, 500);
		
		// Indica cuando se cierra la ventana se cierra la aplicacion
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// Hace visible la ventana
		setVisible(true);
		
		// Creamos el panel
		contentPane = new JPanel();
		
		// Indicamos el diseno del panel
		contentPane.setLayout(null);
		
		// Asignamos el panel a la ventana
		setContentPane(contentPane);
		
		JTextPane nombre = new JTextPane();
		nombre.setBounds(100, 50, 285, 45);
		contentPane.add(nombre);
		
		JTextPane apellido = new JTextPane();
		apellido.setBounds(100, 112, 285, 45);
		contentPane.add(apellido);
		
		JTextPane direccion = new JTextPane();
		direccion.setBounds(100, 169, 285, 45);
		contentPane.add(direccion);
		
		JTextPane dni = new JTextPane();
		dni.setBounds(100, 226, 285, 45);
		contentPane.add(dni);
		
		JTextPane fecha = new JTextPane();
		fecha.setBounds(100, 283, 285, 45);
		contentPane.add(fecha);
		
		JButton editar = new JButton("Editar");
		editar.setBounds(100, 340, 285, 45);
		contentPane.add(editar);
	
	}
}
