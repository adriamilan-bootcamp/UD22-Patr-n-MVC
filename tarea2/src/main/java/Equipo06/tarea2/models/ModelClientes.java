package Equipo06.tarea2.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class ModelClientes {

	private String nombre = "";
	private String apellidos = "";
	private String direccion = "";
	private int dni = 00000000;
	private String fecha = "0000-00-00";

	public ModelClientes() {
		
	}
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param direccion
	 * @param dni
	 * @param fecha
	 */
	public ModelClientes(String nombre, String apellidos, String direccion, int dni, String fecha) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
	}
	
	// Methods
	
	public String getClientes(SQLConnection connection){
		
		final String query = "SELECT * FROM cliente;";
		String returnMessage = "";
		
		ResultSet res = connection.getValues(query);
		try {
			int i = 0;
			while ( res.next() ) {
			    returnMessage += res.getString("id") + " " + res.getString("nombre") + " " + res.getString("apellido") + " " + res.getString("direccion") + " " + res.getString("dni") + " " + res.getString("fecha") + "\n\n";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnMessage;
	}
	
}
