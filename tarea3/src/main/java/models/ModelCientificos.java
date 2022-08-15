package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

public class ModelCientificos {

	/**
	 * Metodo que inserta datos en una tabla
	 * 
	 * @param db       nombre de la base datos donde se insertaran los datos
	 * @param SQLquery sentencia sql de la insercion de los datos en la tabla
	 */

	public static void insertCientificos(Connection conexionbd) {

		try {
			String SQLquery = "";
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
