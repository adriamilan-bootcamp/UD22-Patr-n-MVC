package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

public class ModelClients {
	Connection conexion;

	/**
	 * Metodo que inserta datos en una tabla
	 * 
	 * @param db       nombre de la base datos donde se insertaran los datos
	 * @param SQLquery sentencia sql de la insercion de los datos en la tabla
	 */

	public void insertClient(String nombre, String apellido, String direccion, int dni, Date fecha) {

		try {
			String SQLquery = "insert into clients(nombre,apellido,direccion,dni,fecha) values (" + nombre + ","
					+ apellido + "," + direccion + "," + dni + "," + fecha + ");";
			Statement st = conexion.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("El cliente a sido guardado correctamente");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void seeAllClients() {

	}

	public void findClient() {
	}

	public void updateClient() {
	}

	public void deleteClient() {
	}

}
