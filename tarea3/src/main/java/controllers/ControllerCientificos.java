package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelCientificos;
import views.ViewCientificos;

public class ControllerCientificos implements ActionListener {
	private ModelCientificos cientifico;
	private ViewCientificos view;

	public ControllerCientificos(ModelCientificos cientifico, ViewCientificos view) {
		this.cientifico = cientifico;
		this.view = view;
		// aqui se van asignando los actions a los elemntos de la vista
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}