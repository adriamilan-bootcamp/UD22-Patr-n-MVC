package Equipo06.tarea2.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Equipo06.tarea2.models.ModelClientes;
import Equipo06.tarea2.models.SQLConnection;
import Equipo06.tarea2.views.GetView;
import Equipo06.tarea2.views.MainView;

public class ControllerClientes {
	
	private MainView menu;
	private GetView getView;
	private SQLConnection connection;
	
	private ModelClientes mclientes = new ModelClientes();
	
	public ControllerClientes(MainView menu, GetView getView, SQLConnection connection) {
		
		this.menu = menu;
		this.getView = getView;
		this.connection = connection;
		
		eventManager();
	}
	
	public void eventManager() {
		
		// Ver todos clientes
		this.menu.ver_clientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getView = new GetView("Clientes");
				String res = mclientes.getClientes(connection);
				System.out.println(res);
				getView.textArea.setText(res);
			}
		});
		
	}
	
}
