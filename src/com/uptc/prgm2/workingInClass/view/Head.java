package com.uptc.prgm2.workingInClass.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * final porque no va a cambiar nunca
 * rellenar un ovalo con un color
 * 
 * @author Diego A
 * @Date 7/09/2022
 */
public class Head {
	private final int size;
	private final Color color;
	private final Point point;

	public Head(int size, Color color, Point point) {
		this.size = size;
		this.color = color;
		this.point = point;
	}
	public Graphics show(Graphics graphics) {
		graphics.setColor(color);
		graphics.drawOval(point.x, point.y, size, size);
		graphics.fillOval(point.x, point.y, size, size);
		return graphics;
	}

}
