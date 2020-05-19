package javaGUI;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui11 {
	private static int MAXCOUNT = 20;
	public static void main(String[] args) {
		Dimension dim = new Dimension(200,200);
		
		JFrame frame = new JFrame();
		frame.setLocation(200, 200);
		frame.setPreferredSize(dim);
		
		BoxLayout layout = new BoxLayout(frame.getContentPane(),BoxLayout.X_AXIS);  // BoxLayout 은 매개변수를 2개를 받는다. Y_AXIT
		frame.setLayout(layout);
		for (int i = 0; i < MAXCOUNT; i++) {
			frame.add(new JButton("Test"));
			
		}
		frame.pack();
		frame.setVisible(true);
		
		
		
	}
}
