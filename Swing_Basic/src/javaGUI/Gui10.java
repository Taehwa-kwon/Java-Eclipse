package javaGUI;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui10 {
		final static int MAXCOUNT = 10;
	public static void main(String[] args) {	
		Dimension dim = new Dimension(200,200);
		
		JFrame frame = new JFrame();
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		FlowLayout layout = new FlowLayout();  // 좌측에서 우측으로 UI를 배치하다가 길이가 부족하면 자동으로 줄바꿈 
		frame.setLayout(layout);
		
		for (int i = 0; i < MAXCOUNT; i++) {
			frame.add(new JButton("Test"));
			
		}
		frame.pack();
		frame.setVisible(true);
	}
}
