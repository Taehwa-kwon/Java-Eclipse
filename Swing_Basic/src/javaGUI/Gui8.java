package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Gui8 {
	public static void main(String[] args) {
		
	
	Dimension dim = new Dimension(300,200);
	
	JFrame frame = new JFrame("taehwa swing");
	frame.setLocation(0, 200);
	frame.setPreferredSize(dim);
	
	JLabel label1 = new JLabel("북");
	label1.setHorizontalAlignment(SwingConstants.CENTER);
	label1.setVerticalAlignment(SwingConstants.CENTER);
	label1.setOpaque(true);
	label1.setBackground(Color.blue);
	JLabel label2 = new JLabel("남");
	label2.setHorizontalAlignment(SwingConstants.CENTER);
	label2.setVerticalAlignment(SwingConstants.CENTER);
	label2.setOpaque(true);
	label2.setBackground(Color.red);
	JLabel label3 = new JLabel("서");
	label3.setHorizontalAlignment(SwingConstants.CENTER);
	label3.setVerticalAlignment(SwingConstants.CENTER);
	label3.setOpaque(true);
	label3.setBackground(Color.gray);
	JLabel label4 = new JLabel("동");
	label4.setHorizontalAlignment(SwingConstants.CENTER);
	label4.setVerticalAlignment(SwingConstants.CENTER);
	label4.setOpaque(true);
	label4.setBackground(Color.yellow);
	JLabel label5 = new JLabel("중앙");
	label5.setHorizontalAlignment(SwingConstants.CENTER);
	label5.setVerticalAlignment(SwingConstants.CENTER);
	label5.setOpaque(true);
	label5.setBackground(Color.WHITE);
	
	frame.add(label1,BorderLayout.NORTH);
	frame.add(label2,BorderLayout.SOUTH);
	frame.add(label3,BorderLayout.WEST);
	frame.add(label4,BorderLayout.EAST);
	frame.add(label5,BorderLayout.CENTER);
	
	frame.pack();
	frame.setVisible(true);
	
	}
}
