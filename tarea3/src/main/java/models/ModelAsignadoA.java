package models;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

public class ModelAsignadoA {

	/**
	 * Metodo que inserta datos en una tabla
	 * 
	 * @param db       nombre de la base datos donde se insertaran los datos
	 * @param SQLquery sentencia sql de la insercion de los datos en la tabla
	 */

	public static void insertAsignadoA(Connection conexionbd, String cientifico, char proyecto) {

		try {
			String SQLquery = "insert into asignado_a(cientifico,proyecto) values(" + "'" + cientifico + "'" + "," + "'"
					+ proyecto + "'" + ");";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("cientifico asignado a proyecto correctamente");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void seeAllAsignadoA(Connection conexionbd) {

		try {
			String SQLquery = "select * from asignado_a;";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("estos son todos los datos encontrados");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}

	}

	public void findAsignadoAbyCientifico(Connection conexionbd, String cientifico) {

		try {
			String SQLquery = "select * from asignado_a where cientifico=" + "'" + cientifico + "'" + ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void findAsignadoAbProyecto(Connection conexionbd, char proyecto) {

		try {
			String SQLquery = "select * from asignado_a where proyecto=" + "'" + proyecto + "'" + ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void updateCientificoAsignadoA(Connection conexionbd, String cientifico, char proyecto) {

		try {
			String SQLquery = "update cientificos set cientifico=" + "'" + cientifico + "'" + " where proyecto=" + "'"
					+ proyecto + "'" + ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println(" el cientifico del proyecto a sido actualizado");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void updateProyectoAsignadoA(Connection conexionbd, char proyecto, String cientifico) {

		try {
			String SQLquery = "update cientificos set proyecto=" + "'" + proyecto + "'" + " where cientifico=" + "'"
					+ cientifico + "'" + ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("el proyecto del cientifico a sido actualizado");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	public void deleteAsignadoA(Connection conexionbd, String cientifico, char proyecto) {

		try {
			String SQLquery = "delete from asignado_a where cientifico=" + "'" + cientifico + "'" + " and proyecto="
					+ "'" + proyecto + "'" + ";";
			System.out.println(SQLquery);

			Statement st = conexionbd.createStatement();
			st.executeUpdate(SQLquery);
			System.out.println("la relacion entre el cientifico y el proyecto a sido eliminada");
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

}
