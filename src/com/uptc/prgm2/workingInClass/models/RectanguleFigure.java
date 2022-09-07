
package com.uptc.prgm2.workingInClass.models;


/**
 * 
 */
public class RectanguleFigure extends Posicion {

	private double base;
	private double high;
	
	public RectanguleFigure( Posicion posicion, double base, double high) {
		super(posicion);
		this.base = base;
		this.high = high;
	}

	public double getBase() {
		return base;
	}

	public double getHigh() {
		return high;
	}
	

}