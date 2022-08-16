package AppMain;

import java.sql.Connection;
import java.sql.Date;

import javax.swing.JOptionPane;

import models.DBConnection;
import models.ModelClients;

public class App {

	public static void main(String[] args) {
		Connection java_connection = null;
		java_connection = DBConnection.makeConection(java_connection);
		DBConnection.useDataBase(java_connection, "ud22_01");
		ModelClients.insertClient(java_connection, "pepe", "viyuela", "calle ona,nr4", 87654321, "2022-05-16");
		ModelClients.findClient(java_connection, "pepe");
		System.out.println(ModelClients.findClient(java_connection, "pepe"));
		ModelClients.updateClient(java_connection, "pepe", "nuevonombre", "nuevoapellido", "calle nueva", 13371337, "2022-06-20");
		System.out.println(ModelClients.findClient(java_connection, "nuevonombre"));
		ModelClients.deleteClient(java_connection, "nuevonombre");
		// modelos,vistas y el controlador ->llamar
		DBConnection.closeConnection(java_connection);
	}

}