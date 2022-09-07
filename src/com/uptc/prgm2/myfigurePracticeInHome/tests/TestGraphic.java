package com.uptc.prgm2.myfigurePracticeInHome.tests;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class TestGraphic extends JComponent{


public void paintComponent(Graphics g)
{
   Graphics2D g2 = (Graphics2D) g;

   Ellipse2D.Double head = new Ellipse2D.Double(5, 10, 50, 50);
   g2.draw(head);

   Line2D.Double body=new Line2D.Double(30,60, 30,150);
   g2.draw(body);

   Line2D.Double arm1=new Line2D.Double(30,60,-100,75);
   g2.draw(arm1);
   Line2D.Double arm2=new Line2D.Double(30,60, 85,85);
   g2.draw(arm2);

   }
	public static void main(String[] args) {
		TestGraphic graphic = new TestGraphic();
		JFrame frame = new JFrame();
		//graphic.setBounds(60, 30, 30, 30);
		frame.add(graphic);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}