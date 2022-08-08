package AppMain;

import models.DBConnection;

public class App {

	public static void main(String[] args) {

		DBConnection conexion = new DBConnection();
		// modelos,vistas y el controlador ->llamar
		conexion.closeConnection();
	}

}