package com.uptc.prgm2.workingInClass.models;

/**
 * 
 */
public class CirculeFigure extends Posicion {

	private double radio;

	public CirculeFigure(Posicion posicion, double radioIn) {
		super(posicion);
		this.radio = radioIn;
	}
    public double getRadio() {
		return radio;
	}
}