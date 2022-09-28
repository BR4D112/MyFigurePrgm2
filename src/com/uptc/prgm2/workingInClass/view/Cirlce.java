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
public class Cirlce {
	private final int size;
	private final Color colorLine;
	private final Color colorFill;
	private final Point point;

	public Cirlce(int size, Color colorLineIn, Color colorfillIn, Point point) {
		this.size = size;
		this.colorLine = colorLineIn;
		this.colorFill = colorfillIn;
		this.point = point;
	}
	public Graphics show(Graphics graphics) {
		graphics.setColor(colorLine);
		graphics.drawOval(point.x, point.y, size, size);
		graphics.setColor(colorFill);
		graphics.fillOval(point.x, point.y, size, size);
		return graphics;
	}
//	public Graphics showTriangle(Graphics graphics) {
//		graphics.setColor(colorLine);
//		graphics.drawPolygon(new int[] {10, 50, 250}, new int[] {100, 250, 150}, 3);
//		graphics.setColor(colorFill);
//		graphics.fillPolygon(new int[] {10, 50, 250}, new int[] {100, 250, 150}, 3);
//		graphics.setColor(colorLine);
//		graphics.drawPolygon(new int[] {100, 140, 340}, new int[] {200, 350, 250}, 3);
//		graphics.setColor(colorFill);
//		graphics.fillPolygon(new int[] {100, 140, 340}, new int[] {200, 350, 250}, 3);
//		System.out.println("entro aqui");
//		return graphics;
//	}
	
}
