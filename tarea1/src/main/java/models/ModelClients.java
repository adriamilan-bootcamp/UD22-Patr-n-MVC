package models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

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

	public static void seeAllClients(Connection conexionbd) {
		try {
			String SQLquery = "select * from clientes";
			System.out.println(SQLquery);
			
			Statement st = conexionbd.createStatement();
			ResultSet allClients = st.executeQuery(SQLquery);
			while (allClients.next()) {
		        String coffeeName = allClients.getString(2);
		        System.out.println(coffeeName);
		      }
		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

	/**
	 *  This function tries to find a client by matching the provided name and theirs.
	 *  It returns a String containing everything regarding the matched client.
	 *  
	 *  @param clientName			The name of the client to be searched
	 *  @param databaseConnection	The MySQL handle
	 *  
	 *  @return						String containing a dump of that client's information as an String
	 */
	public static String findClient(Connection databaseConnection, String clientName) {
		// String that will get generated with the client's data (If found)
		StringBuilder clientData = new StringBuilder();
		
		// Surround with Try-Catch to handle SQL-related errors
		try {
			/*
			 *  The SQL Query SELECT's everything from the 'clientes' table pattern-matching it
			 *  with the provided client's name on the function argument
			 */
			String SQLquery = "SELECT * FROM clientes WHERE nombre = '" + clientName + "';";

			// SQL Statement to handle
			Statement st = databaseConnection.createStatement();
			
			// Execute the query
			ResultSet clientToFind = st.executeQuery(SQLquery);
			
			// Query's ResultSet parser-helper
			ResultSetMetaData resultSetHelper = (ResultSetMetaData) clientToFind.getMetaData();

			// Process the entire clientToFind ResultSet
			while (clientToFind.next()) {
				// Loop that starts at i = 2 to skip the 'id' column
			    for (int i = 2; i <= resultSetHelper.getColumnCount(); i++) {
			    	// Append the column's name and it's value
			    	clientData.append(resultSetHelper.getColumnName(i) + ": " + clientToFind.getString(i));
			    	
			        // Minor aesthetic aid that helps format the printed string
			        if (i + 1 <= resultSetHelper.getColumnCount())
			        {
			        	clientData.append(", ");
			        }
			    }
			    clientData.append("");
			}

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}

		// Return the client's String
		return clientData.toString();
	}

	public void updateClient() {
	}

	/**
	 *  This function will delete all the records of the client that is specified w/the function
	 *  argument 'clientName'
	 *  
	 *  @param databaseConnection	The MySQL handle
	 *  @param clientName			The name of the client to be deleted
	 */
	public static void deleteClient(Connection databaseConnection, String clientName) {
		// Surround with Try-Catch to handle SQL-related errors
		try {
			/*
			 *  The SQL Query DELETE's everything from the 'clientes' client pattern-matching it
			 *  with the provided client's name on the function argument
			 */
			String sqlQuery = "DELETE FROM clientes WHERE nombre = '" + clientName + "';";

			// SQL Statement to handle
			Statement sqlStatement = databaseConnection.createStatement();
			
			// Execute the query, use executeUpdate instead of executeQuery to properly update the tables
			sqlStatement.executeUpdate(sqlQuery);

		} catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
		}
	}

}
