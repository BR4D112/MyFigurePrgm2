package com.uptc.prgm2.workingInClass.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;

public class JFrameArea extends JFrame {

	private static final long serialVersionUID = 1L;
	// public static final Image ICONAPP =
	// Toolkit.getDefaultToolkit().getImage("C://");
	private Cirlce head;
	private Cirlce body;
	private Cirlce eye;
	private Cirlce eyeIn;
	private Rectangle[] legs;
	private Triangle[] feet;
	private ArrayList<Triangle> triangleHead;
	private Poligon[] hand;

	public JFrameArea() {
		this.head = new Cirlce(75, Color.black, Color.red, new Point(725, 165));
	}

	public JFrameArea(int widthIn, int heightIn) {
		this.printPicture();
		this.init(widthIn, heightIn);
	}

	private void printPicture() {
		this.setHead();
		this.setLegs();
		this.setTrianglesHead();
		this.setHand();
	}

	/**
	 * get toolkit para setear icono con la ubicacion de la imagen traer la imagen
	 * 
	 * @param widthIn
	 * @param heightIn
	 */
	private void init(int widthIn, int heightIn) {
		this.getContentPane().setBackground(Color.white);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
//		this.setLocation(600, 200);
//		this.setSize(widthIn, heightIn);
//		this.setIconImage(Toolkit.getDefaultToolkit().createImage("C://"));
		this.setTitle(Messages.getFullNameApp());
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println(this.getGraphics());
		System.out.println(this.getGraphics());
//		this.repaint();
//		this.paint(this.getGraphics());
	}

	private void setHead() {
		this.head = new Cirlce(175, Color.black, Color.yellow, new Point(630, 70));
		this.body = new Cirlce(300, Color.black, Color.yellow, new Point(460, 220));
		this.eye = new Cirlce(35, Color.black, Color.white, new Point(730, 85));
		this.eyeIn = new Cirlce(20, Color.black, Color.black, new Point(740, 100));
	}

	private void setTrianglesHead() {
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();
		triangles
				.add(new Triangle(new Point(643, 150), new Point(628, 86), new Point(675, 95), Color.black, Color.red));
		triangles
				.add(new Triangle(new Point(663, 110), new Point(660, 60), new Point(697, 75), Color.black, Color.red));
		triangles.add(new Triangle(new Point(687, 85), new Point(700, 40), new Point(765, 95), Color.black, Color.red));
		triangles.add(
				new Triangle(new Point(620, 100), new Point(645, 150), new Point(655, 120), Color.black, Color.red));
		triangles
				.add(new Triangle(new Point(655, 120), new Point(645, 68), new Point(675, 95), Color.black, Color.red));
		triangles.add(new Triangle(new Point(670, 45), new Point(675, 95), new Point(705, 80), Color.black, Color.red));
		triangles.add(new Triangle(new Point(705, 80), new Point(735, 30), new Point(762, 82), Color.black, Color.red));
		triangles.add(
				new Triangle(new Point(790, 130), new Point(790, 190), new Point(850, 160), Color.black, Color.orange));
		this.triangleHead = triangles;
	}

	private void setLegs() {
		this.legs = new Rectangle[] { new Rectangle(new Point(635, 475), 35, 140, Color.orange, Color.orange),
				new Rectangle(new Point(555, 475), 35, 140, Color.orange, Color.orange) };
		this.feet = new Triangle[] {
				new Triangle(new Point(635, 585), new Point(635, 625), new Point(705, 625), Color.orange, Color.orange),
				new Triangle(new Point(555, 585), new Point(555, 625), new Point(625, 625), Color.orange,
						Color.orange) };
	}

	private void setHand() {
		this.hand = new Poligon[] { new Poligon(new Point(530, 450), Color.black).add(new Point(560, 320)),
				new Poligon(new Point(530, 450), Color.black).add(new Point(650, 400)) };

	}

	@Override
	public void paint(Graphics graphics) {
		for (Triangle triangle : triangleHead) {
			triangle.showTriangle(graphics);
		}
		head.show(this.getGraphics());
		body.show(this.getGraphics());
		eye.show(this.getGraphics());
		eyeIn.show(this.getGraphics());
		for (Rectangle rectangle : this.legs) {
			rectangle.show(graphics);
		}
		for (Triangle triangle : this.feet) {
			triangle.showTriangle(graphics);
		}
		for (Poligon poligon : hand) {
			poligon.show(graphics);
		}
	}

}
