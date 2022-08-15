package AppMain;

import java.sql.Connection;

import models.DBConnection;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws ClassNotFoundException {
		Connection java_connection = null;
		java_connection = DBConnection.makeConection(java_connection);
		DBConnection.useDataBase(java_connection, "ud22_03");

		DBConnection.closeConnection(java_connection);
	}
}
