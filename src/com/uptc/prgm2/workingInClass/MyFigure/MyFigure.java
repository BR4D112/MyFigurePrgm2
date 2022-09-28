package com.uptc.prgm2.workingInClass.MyFigure;

import com.uptc.prgm2.workingInClass.control.ControllerMyFigure;
import com.uptc.prgm2.workingInClass.model.FigureModel;
import com.uptc.prgm2.workingInClass.view.ViewFigure;


public class MyFigure {
	private final FigureModel model;
	private final ViewFigure views;
	private final ControllerMyFigure controller;

	public MyFigure(double size, double x, double y) {
		this.model = new FigureModel();
		this.views = new ViewFigure();
		this.controller = new ControllerMyFigure(this.views, this.model);
	}

	public static void main(String[] args) {
		if (args.length == 3) {
			if (true) {
				
				new MyFigure(
						Double.parseDouble(args[0]), 
						Double.parseDouble(args[1]), 
						Double.parseDouble(args[2]));
			}
			System.out.println("eror en el valor de los parametros");
		} else {
			System.out.println("Error # de argumentos no es valido");
		}
	}
}
