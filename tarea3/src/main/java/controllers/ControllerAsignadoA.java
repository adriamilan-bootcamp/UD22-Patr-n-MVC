package controllers;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelAsignadoA;
import views.ViewAsignadoA;
import views.ViewMain;

public class ControllerAsignadoA implements ActionListener {
	private ModelAsignadoA asignado;
	private ViewAsignadoA frame = new ViewAsignadoA();
	private ViewMain viewMain = new ViewMain();
	private ControllerMain controllerMain;

	public ControllerAsignadoA() {
		ventanaAsignarA();
		// aqui se van asignando los actions a los elemntos de la vista
		actionBtnVolver();
	}

	public void ventanaAsignarA() {
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

	public void actionBtnVolver() {
		frame.getBtnVolver().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				controllerMain = new ControllerMain();
			}
		});
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}