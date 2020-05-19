package javaGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui5 {
	public static void main(String[] args) {
	
		Dimension dim = new Dimension(200,400);
		
		JFrame frame = new JFrame("태화의 swing 연습");
		frame.setLocation(0,200);
		frame.setPreferredSize(dim);
		
		JButton button = new JButton("Click me");
		button.setText("setText 사용");   //버튼타이틀을 변경할떄 쓰는 메소드
		//System.out.println("getText : " + button.getText());		// 버튼 타이틀 텍스트를 읽는 메소드
		
		button.setOpaque(true);
		button.setFont(new Font("궁서",Font.ITALIC,20));
		button.setForeground(Color.green);
		button.setBackground(Color.YELLOW);
		//System.out.println("getFont : " + button.getFont());
		
		frame.add(button);
		
		frame.pack();
		frame.setVisible(true);
	}
}
