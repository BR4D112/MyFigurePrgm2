package com.uptc.prgm2.workingInClass.models;

public class Equis extends Posicion {

	private double size;
	private double angleInclination;

	public Equis(Posicion posicion, double size, double angleInclination) {
		super(posicion);
		this.size = size;
		this.angleInclination = angleInclination;
	}

	public double getSize() {
		return size;
	}

	public double getAngleInclination() {
		return angleInclination;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public void setAngleInclination(double angleInclination) {
		this.angleInclination = angleInclination;
	}

}
