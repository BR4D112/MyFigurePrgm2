package com.uptc.prgm2.myfigurePracticeInHome.views;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ManageUI {
	private Scanner scan;

	public ManageUI() {
		this.scan = new Scanner(System.in);
	}
	public String getString(String message) {
		System.out.println(message);
		return scan.nextLine();
	}
	public void manageJFrame() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JPanel jPanel = new JPanel();
		frame.setSize(300, 300);
		frame.setLocation(550, 200);
		frame.setVisible(true);
		JLabel label1 = new JLabel("Test");
		label1.setText("Holi");
		jPanel.add(label1);
		frame.add(jPanel);
	}
	
	
	
}

