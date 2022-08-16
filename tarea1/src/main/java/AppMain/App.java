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
		ModelClients.insertClient(java_connection, "alex", "pepe", "calle ona,nr4", 87654321, "2022-05-16");
		ModelClients.seeAllClients(java_connection);
		System.out.println("Here");
		ModelClients.findClient(java_connection, "alex");
		System.out.println("Here2");
		ModelClients.deleteClient(java_connection, "alex");
		System.out.println("Here3");
		// modelos,vistas y el controlador ->llamar
		DBConnection.closeConnection(java_connection);
	}

}