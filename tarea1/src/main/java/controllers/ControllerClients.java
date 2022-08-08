package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelClients;
import views.ViewClients;

public class ControllerClients implements ActionListener {
	private ModelClients clients;
	private ViewClients view;

	public ControllerClients(ModelClients clients, ViewClients view) {
		this.clients = clients;
		this.view = view;
		// aqui se van asignando los actions a los elemntos de la vista
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
