package com.uptc.prgm2.workingInClass.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Triangle {
	public static final int SIDES_TRIANGLE = 3;
	private final int[] pointX;
	private final int[] pointY;
	private final Color colorLine;
	private final Color colorFill;

	public Triangle(Point one, Point two ,Point three, Color colorLine, Color colorFill) {
		this.pointX = new int[] {one.x, two.x, three.x};
		this.pointY = new int[] {one.y, two.y, three.y};
		this.colorLine = colorLine;
		this.colorFill = colorFill;
	}

	public Graphics showTriangle(Graphics graphics) {
		graphics.setColor(colorLine);
		graphics.drawPolygon(this.pointX, this.pointY, SIDES_TRIANGLE);
		graphics.setColor(colorFill);
		graphics.fillPolygon(this.pointX, this.pointY, SIDES_TRIANGLE);
		return graphics;
	}
}
