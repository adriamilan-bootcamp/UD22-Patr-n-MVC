package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

public class ModelClients {

	/**
	 * Metodo que inserta datos en una tabla
	 * 
	 * @param db       nombre de la base datos donde se insertaran los datos
	 * @param SQLquery sentencia sql de la insercion de los datos en la tabla
	 */

	public static void insertClient(Connection conexionbd, String nombre, String apellido, String direccion, int dni, String fecha) {

		try {
			String SQLquery = "insert into clientes(nombre,apellido,direccion,dni,fecha) values (" 
					+ "'" + nombre + "',"
					+ "'" + apellido + "',"
					+ "'" + direccion + "',"
					+ dni + ","
					+ "'" + fecha + "');";
			System.out.println(SQLquery);
			
			Statement st = conexionbd.createStatement();
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
