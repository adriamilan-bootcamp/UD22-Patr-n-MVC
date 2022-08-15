package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelAsignadoA;
import views.ViewAsignadoA;

public class ControllerAsignadoA implements ActionListener {
	private ModelAsignadoA asignado;
	private ViewAsignadoA view;

	public ControllerAsignadoA(ModelAsignadoA asignado, ViewAsignadoA view) {
		this.asignado = asignado;
		this.view = view;
		// aqui se van asignando los actions a los elemntos de la vista
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}