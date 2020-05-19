package javaGUI;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Gui2 {

	public static void main(String[] args) {
		Dimension dim = new Dimension(1000,300);
		
		JFrame frame = new JFrame("taehwa");
		frame.setLocation(200,400); //프레임이 시작되는 위치 x,y
		frame.setPreferredSize(dim); // 해당 크기
		frame.pack();
		frame.setVisible(true);

	}

}
