package AppMain;

import models.DBConnection;

public class App {

	public static void main(String[] args) {

		DBConnection conexion = new DBConnection();
		conexion.useDataBase("ud22_01");
		// modelos,vistas y el controlador ->llamar
		conexion.closeConnection();
	}

}