package controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelProyectos;
import views.ViewMain;
import views.ViewProyectos;

public class ControllerProyectos implements ActionListener {
	private ModelProyectos proyectos;
	private ViewProyectos frame = new ViewProyectos();
	private  ViewMain viewMain = new ViewMain();

	public ControllerProyectos() {
		
		ventanaProyectos();
		// aqui se van asignando los actions a los elemntos de la vista
	}
	
	public void ventanaProyectos() {
		viewMain.setVisible(false);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}