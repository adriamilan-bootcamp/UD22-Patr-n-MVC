package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

public class ModelProyectos {

	/**
	 * Metodo que inserta datos en una tabla
	 * 
	 * @param db       nombre de la base datos donde se insertaran los datos
	 * @param SQLquery sentencia sql de la insercion de los datos en la tabla
	 */

	public static void insertProyectos(Connection conexionbd, char id, String nombre, int horas) {

		try {
			String SQLquery = "insert into proyectos(id,nombre,horas) values(" + "'" + id + "'" + "," + "'" + nombre
					+ "'" + "," + horas + ");";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("El proyecto a sido guardado correctamente");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void seeAllProyectos(Connection conexionbd) {
		try {
			String SQLquery = "select * from proyectos;";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("estos son todos los proyectos");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}

	}

	public void findProyecto(Connection conexionbd, char id) {
		try {
			String SQLquery = "select * from proyectos where id=" + "'" + id + "'" + ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("estos son todos los datos del proyecto buscado");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void updateProyecto(Connection conexionbd, char id, String nombre, int horas) {
		try {
			String SQLquery = "update proyectos set nombre =" + "'" + nombre + "'" + ",horas=" + horas + " where id="
					+ "'" + id + "'" + ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("el proyecto a sido actualizado");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void deleteProyecto(Connection conexionbd, char id) {
		try {
			String SQLquery = "delete from proyectos where id =" + "'" + id + "'" + ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("el proyecto a sido eliminado");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

}
