package AppMain;

import java.sql.Date;

import models.DBConnection;
import models.ModelClients;

public class App {

	public static void main(String[] args) {
		ModelClients model = new ModelClients();
		DBConnection conexion = new DBConnection();
		conexion.useDataBase("ud22_01");
		model.insertClient("maria", "antonieta", "calle pepe,nr3", 12345678, Date.valueOf("2022-05-12"));
		// modelos,vistas y el controlador ->llamar
		conexion.closeConnection();
	}

}