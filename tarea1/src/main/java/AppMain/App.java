package AppMain;

import java.sql.Connection;
import java.sql.Date;

import models.DBConnection;
import models.ModelClients;

public class App {

	public static void main(String[] args) {
		Connection java_connection = null;
		java_connection = DBConnection.makeConection(java_connection);
		DBConnection.useDataBase(java_connection, "ud22_01");
		ModelClients.insertClient(java_connection, "maria", "antonieta", "calle pepe,nr3", 12345678, "2022-05-12");
		// modelos,vistas y el controlador ->llamar
		DBConnection.closeConnection(java_connection);
	}

}