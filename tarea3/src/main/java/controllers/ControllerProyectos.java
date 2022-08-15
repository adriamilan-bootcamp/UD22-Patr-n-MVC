package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelProyectos;
import views.ViewProyectos;

public class ControllerProyectos implements ActionListener {
	private ModelProyectos proyectos;
	private ViewProyectos view;

	public ControllerProyectos(ModelProyectos proyectos, ViewProyectos view) {
		this.proyectos = proyectos;
		this.view = view;
		// aqui se van asignando los actions a los elemntos de la vista
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}