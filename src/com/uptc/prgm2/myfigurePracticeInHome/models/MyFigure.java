package com.uptc.prgm2.myfigurePracticeInHome.models;

import java.awt.Color;

public abstract class MyFigure {
	private final double size;
	private final Coord coord;
	private final Color color;

	public MyFigure(double size, Coord coord, Color color) {
		this.size = size;
		this.coord = coord;
		this.color = color;
	}

	public double getSize() {
		return size;
	}

	public Coord getCoord() {
		return coord;
	}

	public Color getColor() {
		return color;
	}
	
}
