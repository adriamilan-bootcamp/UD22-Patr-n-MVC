package Equipo06.tarea2.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelVideos {

	private String title;
	private String director;
	private String clienteid;
	
	public ModelVideos() {
		
	}
	
	/**
	 * @param title
	 * @param director
	 * @param clienteid
	 */
	public ModelVideos(String title, String director, String clienteid) {
		super();
		this.title = title;
		this.director = director;
		this.clienteid = clienteid;
	}
	
	// Methods
	
	public String getVideos(SQLConnection connection){
		
		final String query = "SELECT * FROM cliente;";
		String returnMessage = "";
		
		ResultSet res = connection.getValues(query);
		try {
			int i = 0;
			while ( res.next() ) {
			    returnMessage += res.getString("nombre") + res.getString("apellido") + res.getString("direccion") + res.getString("dni") + res.getString("fecha") + "\n\n";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return returnMessage;
	}

	
	
}
