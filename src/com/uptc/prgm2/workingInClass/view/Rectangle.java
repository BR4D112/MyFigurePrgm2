package com.uptc.prgm2.workingInClass.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle {
	private Point point;
	private int width, height;
	private Color colorLine;
	private Color colorFull;

	
	public Rectangle(Point point, int width, int height, Color colorLine, Color colorFull) {
		super();
		this.point = point;
		this.width = width;
		this.height = height;
		this.colorLine = colorLine;
		this.colorFull = colorFull;
	}


	public Graphics show(Graphics graphics) {
		graphics.setColor(this.colorLine);
		graphics.drawRect(this.point.x, this.point.y, width, height);
		graphics.setColor(this.colorFull);
		graphics.fillRect(this.point.x, this.point.y, width, height);
		return graphics;
	}

}
