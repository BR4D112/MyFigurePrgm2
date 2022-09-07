package com.uptc.prgm2.workingInClass.models;

/**
 * 
 */
public class Posicion {

	protected double valorX;
	protected double valorY;

	public Posicion(double valorX, double valorY) {
		this.valorX = valorX;
		this.valorY = valorY;
	}
	public Posicion(Posicion posicion) {
		this.valorX = posicion.valorX;
		this.valorY = posicion.valorY;
	}
	/**
	 * obtiene el valor x de la cordenada
	 * @return el valor X 
	 */
	public double getValorX() {
		return valorX;
	}
	/**
	 * obtiene el valor y de la cordenada
	 * @return el valor Y 
	 */
	public double getValorY() {
		return valorY;
	}
	
	

}