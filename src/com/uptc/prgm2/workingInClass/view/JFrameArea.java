package com.uptc.prgm2.workingInClass.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameArea extends JFrame {
	public static final Image ICONAPP = Toolkit.getDefaultToolkit().getImage("C://");
	private Head head;

	public JFrameArea(int widthIn, int heightIn) {
		super();
		this.head = new Head(100, Color.blue, new Point(200, 200));
		init(widthIn, heightIn);
	}

	/**
	 * get toolkit para setear icono con la ubicacion de la imagen traer la imagen
	 * 
	 * @param widthIn
	 * @param heightIn
	 */
	private void init(int widthIn, int heightIn) {
		this.getContentPane().setBackground(Color.red);
//		this.setLocation(600, 200);
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
//		this.setSize(widthIn, heightIn);
		this.setTitle(Messages.getFullNameApp());
//		this.setResizable(false);
//		this.setIconImage(Toolkit.getDefaultToolkit().createImage("C://"));
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		System.out.println(this.getGraphics());
//		System.out.println(this.getGraphics());
		//this.repaint();
	}
	//@Override
	public void paint2(Graphics graphics) {
		super.paint(this.getGraphics());
		head.show(this.getGraphics());
		System.out.println("entro");
	}

}
