package Equipo06.tarea2.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Equipo06.tarea2.models.ModelClientes;
import Equipo06.tarea2.models.ModelVideos;
import Equipo06.tarea2.models.SQLConnection;
import Equipo06.tarea2.views.GetView;
import Equipo06.tarea2.views.MainView;

public class ControllerVideos {

	private MainView menu;
	private GetView getView;
	private SQLConnection connection;
	
	// Modelos
	private ModelVideos mvideos = new ModelVideos();
	
	public ControllerVideos(MainView menu, GetView getView, SQLConnection connection) {
		
		this.menu = menu;
		this.getView = getView;
		this.connection = connection;
		
		eventManager();
	}
	
	public void eventManager() {
		
		// Vet todos videos
		this.menu.ver_videos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getView = new GetView("Videos");
				String res = mvideos.getVideos(connection);
				System.out.println(res);
				getView.textArea.setText(res);
			}
		});
		
	}
	
}
