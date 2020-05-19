//GridLayout
package javaGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Gui4 {

	public static void main(String[] args) {
		Dimension dim = new Dimension(200,400); //swing 창의 전체 크기
		
		JFrame frame = new JFrame("태화의 Swing");   //프레임의 이름 설정과 객체 생성
		frame.setLocation(0, 100); 					// 프레임의 시작위치
		frame.setPreferredSize(dim);				//프레임의 크기 설정을 실행시켜주는 
		
		GridLayout layout = new GridLayout(2,1);
		frame.setLayout(layout);
		
		
		JLabel label1 = new JLabel();
		
		label1.setText("taehwa1");
		label1.setOpaque(true);//색상을 적용하겠다는 기본 메소드
		label1.setBackground(Color.black);
		label1.setForeground(Color.RED);
		
		label1.setVerticalAlignment(SwingConstants.CENTER); // 세로
		label1.setHorizontalAlignment(SwingConstants.CENTER); // 가로
		
		JLabel label2 = new JLabel();
		label2.setOpaque(true);//색상을 적용하겠다는 기본 메소드
		label2.setText("taehwa2");
		label2.setBackground(Color.yellow);
		
		
		label2.setVerticalAlignment(SwingConstants.CENTER); // 세로
		label2.setHorizontalAlignment(SwingConstants.CENTER); // 가로
		
		frame.add(label1); // 프레임안에 각각의 라벨을 넣어줌
		frame.add(label2);	// 프레임안에 각각의 라벨을 넣어줌
		
		frame.pack(); // 이게 없으면 최소화의 창 만을 보여
		frame.setVisible(true);  // 프레임을 보여주게 만든다.

	}

}
