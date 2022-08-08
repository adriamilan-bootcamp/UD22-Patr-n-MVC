package AppMain;

import models.DBConnection;

public class App {
		
	public static void main(String[] args) {
		
		DBConnection conexion = new DBConnection();			
		
		structureCreation(conexion);
		
		conexion.closeConnection();		
	}
	
	/**
	* Metodo donde se realiza la creacion de la estructura mysql con datos estaticos
	*/
	public static void structureCreation(DBConnection conexion) {
		
		String dbName = "UD22_Tarea01";
		
		conexion.createDB(dbName); 
		
		conexion.createTable(dbName, "CREATE TABLE Cliente (id int(11) NOT NULL AUTO_INCREMENT, nombre varchar(250) DEFAULT NULL, apellido varchar(250) DEFAULT NULL, direccion varchar(250) DEFAULT NULL, dni int(11) DEFAULT NULL, fecha date DEFAULT NULL, PRIMARY KEY (id));");

	}
	
}