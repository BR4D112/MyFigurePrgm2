package Tests.view.JframeArea;

import com.uptc.prgm2.workingInClass.view.JFrameArea;

public class TestJFrameArea {
	
	public static void main(String[] args) {
		//JFrameArea area = new JFrameArea(500,500);
		int width = 500;
		int heigh = 500;
//		System.out.println(java.awt.Toolkit.getDefaultToolkit().getScreenResolution());
		new JFrameArea(width, heigh);
	}

}
