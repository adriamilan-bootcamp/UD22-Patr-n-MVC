package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import models.DBConnection;
import models.ModelClients;
import views.ViewClients;

public class ControllerClients implements ActionListener {
	private ModelClients clients;
	private ViewClients view;

	static Connection java_connection = null;
	
	public ControllerClients(ModelClients clients, ViewClients view) {
		this.clients = clients;
		this.view = view;
		
		// aqui se van asignando los actions a los elemntos de la vista
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public static boolean makeConnection() {
		java_connection = DBConnection.makeConection(java_connection);
		
		return ((java_connection != null) ? true : false);
	}
}
