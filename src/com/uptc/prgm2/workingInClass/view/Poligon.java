package com.uptc.prgm2.workingInClass.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class Poligon {
	private Polygon polygon;
	private Color colorLine;

	public Poligon(Point one, Color color) {
		this.polygon = new Polygon();
		this.add(one);
		this.colorLine = color;
	}

	public Poligon add(Point one) {
		polygon.addPoint(one.x, one.y);
		return this;
	}

	public void show(Graphics graphics) {
		graphics.setColor(colorLine);
		graphics.drawPolygon(polygon);

	}

}
