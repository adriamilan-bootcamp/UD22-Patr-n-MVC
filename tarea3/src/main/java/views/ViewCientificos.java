package views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JSpinner;
import javax.swing.JList;

public class ViewCientificos extends JFrame {

	private JPanel contentPane;
	private JPanel panelAdd;
	private JPanel panelActualizar;
	private JPanel panelEliminar;
	private JPanel panelBuscar;
	private JPanel panelVerTodo;
	private JTextField tfDni;
	private JTextField textField;
	private JButton btnAddCientifico;
	private JButton btnVolver;
	private JButton btnEliminarCientifico;
	private JButton btnActualizar;
	private JButton btnVerTodo;
	private JButton btnGuardar;
	private JButton btnBuscar;
	private JTextArea textArea;
	private JList list;
	private JTextField textField_1;

	public ViewCientificos() {
		setTitle("CIENTIFICOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_opciones = new JPanel();
		panel_opciones.setBounds(12, 12, 181, 235);
		contentPane.add(panel_opciones);
		panel_opciones.setLayout(null);

		btnAddCientifico = new JButton("Añadir ");

		btnAddCientifico.setBounds(0, 12, 169, 25);
		panel_opciones.add(btnAddCientifico);

		btnVolver = new JButton("Volver Inicio");

		btnVolver.setBounds(0, 210, 169, 25);
		panel_opciones.add(btnVolver);

		btnEliminarCientifico = new JButton("Eliminar");

		btnEliminarCientifico.setBounds(0, 152, 169, 25);
		panel_opciones.add(btnEliminarCientifico);

		btnActualizar = new JButton("Actualizar");

		btnActualizar.setBounds(0, 116, 169, 25);
		panel_opciones.add(btnActualizar);

		btnVerTodo = new JButton("Ver Todo");

		btnVerTodo.setBounds(0, 46, 169, 25);
		panel_opciones.add(btnVerTodo);

		btnBuscar = new JButton("Buscar");

		btnBuscar.setBounds(0, 79, 169, 25);
		panel_opciones.add(btnBuscar);

		panelAdd = new JPanel();
		panelAdd.setBackground(Color.GRAY);
		panelAdd.setBounds(247, 12, 181, 235);
		contentPane.add(panelAdd);
		panelAdd.setLayout(null);
		panelAdd.setVisible(false);

		JLabel lblNewLabel = new JLabel("DNI");
		lblNewLabel.setBounds(12, 22, 70, 15);
		panelAdd.add(lblNewLabel);

		tfDni = new JTextField();
		tfDni.setBounds(12, 39, 114, 19);
		panelAdd.add(tfDni);
		tfDni.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Nombre Apellido");
		lblNewLabel_1.setBounds(12, 82, 140, 15);
		panelAdd.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(12, 98, 114, 19);
		panelAdd.add(textField);
		textField.setColumns(10);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(31, 198, 117, 25);
		panelAdd.add(btnGuardar);

		panelVerTodo = new JPanel();
		panelVerTodo.setBackground(Color.PINK);
		panelVerTodo.setBounds(247, 12, 181, 235);
		contentPane.add(panelVerTodo);
		panelVerTodo.setLayout(null);
		panelVerTodo.setVisible(false);

		textArea = new JTextArea();
		textArea.setBackground(Color.WHITE);
		textArea.setEditable(false);
		textArea.setBounds(12, 12, 157, 211);
		panelVerTodo.add(textArea);
		

		panelBuscar = new JPanel();
		panelBuscar.setBackground(Color.ORANGE);
		panelBuscar.setBounds(247, 12, 181, 235);
		contentPane.add(panelBuscar);
		panelBuscar.setLayout(null);
		panelBuscar.setVisible(false);

		panelActualizar = new JPanel();
		panelActualizar.setBackground(Color.MAGENTA);
		panelActualizar.setBounds(247, 12, 181, 235);
		contentPane.add(panelActualizar);
		panelActualizar.setLayout(null);
		panelActualizar.setVisible(false);

		panelEliminar = new JPanel();
		panelEliminar.setBackground(Color.CYAN);
		panelEliminar.setBounds(247, 12, 181, 235);
		contentPane.add(panelEliminar);
		panelEliminar.setLayout(null);
		panelEliminar.setVisible(false);

	}

	public JButton getBtnAddCientifico() {
		return btnAddCientifico;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public JButton getBtnEliminarCientifico() {
		return btnEliminarCientifico;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public JButton getBtnVerTodo() {
		return btnVerTodo;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	public JPanel getPanelActualizar() {
		return panelActualizar;
	}

	public JPanel getPanelAdd() {
		return panelAdd;
	}

	public JPanel getPanelEliminar() {
		return panelEliminar;
	}

	public JPanel getPanelBuscar() {
		return panelBuscar;
	}

	public JPanel getPanelVerTodo() {
		return panelVerTodo;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	
}