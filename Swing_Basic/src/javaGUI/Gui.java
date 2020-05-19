package javaGUI;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui {
	public static void main(String[] args) {
		JFrame frame = new JFrame("!!!");
		JLabel label = new JLabel("Hello");
		frame.add(label); 
		frame.pack(); // 이게 없으면 최소화의 창 만을 보여
		frame.setVisible(true);
	}
	
	
}
