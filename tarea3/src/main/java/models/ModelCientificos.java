package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

public class ModelCientificos {
	private DBConnection conexion = new DBConnection();
	static Connection conexionbd = null;

	/**
	 * Metodo que inserta datos en una tabla
	 * 
	 * @param db       nombre de la base datos donde se insertaran los datos
	 * @param SQLquery sentencia sql de la insercion de los datos en la tabla
	 */

	public void insertCientificos(String dni, String nom_apell) {

		String SQLquery = "insert into cientificos(dni,nom_apell) values(" + "'" + dni + "'," + "'" + nom_apell + "'"
				+ ");";
		System.out.println(SQLquery);

		conexion.updateQuery(SQLquery);

	}

	public ResultSet seeAllCientificos() {

		String SQLquery = "select * from cientificos;";

		// Statement st = conexionbd.createStatement();
		// st.executeUpdate(SQLquery);
		return conexion.getValues(SQLquery);

	}

	public void findCientifico(String dni) {
		try {
			String SQLquery = "select * from cientificos where dni=" + "'" + dni + "'" + ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("Esto es todo lo que hay del cientifico buscado");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void updateCientifico(String dni, String nom_apell) {
		try {
			String SQLquery = "update cientificos set nom_apell=" + "'" + nom_apell + "' where dni =" + "'" + dni + "'"
					+ ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("Datos cientifico actualizados");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void deleteCientifico(String dni) {
		try {
			String SQLquery = "delete from cientificos where dni =" + "'" + dni + "'" + ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("Datos cientifico eliminados");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

}
