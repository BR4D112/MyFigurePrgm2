package com.uptc.prgm2.workingInClass.model;

public class Botton extends CirculeFigure {

	private Equis equis;
	public static final double SIZE_EQUIS_DEFAULT = 0.5;
	public static final double ANGLE_INCLINATION_EQUIS_DEFAULT = 0;

	public Botton(Posicion posicion, double radioIn, int sizeBoton) {
		super(posicion, radioIn);
		this.equis = new Equis(posicion, radioIn * SIZE_EQUIS_DEFAULT, ANGLE_INCLINATION_EQUIS_DEFAULT);
	}

	public Botton setSizeEquis(double value) {
		this.equis.setSize(value);
		return this;
	}

	public Botton setAngleEquis(double value) {
		this.equis.setAngleInclination(value);
		return this;
	}

}