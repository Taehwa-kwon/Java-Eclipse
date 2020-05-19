package javaGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Gui3 {

	public static void main(String[] args) {
		
		Dimension dim = new Dimension (200,400);  //swing 실행창의 크기
		
		JFrame frame = new JFrame("태화");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		JLabel label = new JLabel(); 			//방법 1. 안에 텍스트를 추가해줌 .
		label.setText("Hello");					//방법 2. setText 메소드사용
		System.out.println(label.getText());	//방법 3. 따로getText 메소드 호출
		
		Font font = new Font("궁서",Font.BOLD,20);	//글치체
		label.setFont(font);
		
		label.setOpaque(true); //색상을 적용하겠다는 기본 메소드
		Color color = new Color(30,170,20);
		Color color2 = new Color(10,40,60,50);  //빨강,녹색,파랑,투명도
		label.setForeground(color);  			//폰트 색상
		label.setBackground(color2);			//백 그라운드 색상
		// label.setForeground(Color.red);  		//바로 색상값입력도 가능 

		
		label.setVerticalAlignment(SwingConstants.BOTTOM);   	//세로 정렬   SwingConstants 라는 인터페이스인데 정렬에 관한 속성이 정의된 인터페이스
		label.setHorizontalAlignment(SwingConstants.CENTER); 	//가로 정렬 
		
		
		
		frame.add(label);
		frame.pack();
		frame.setVisible(true);
		
		System.out.println(label.getHorizontalAlignment());
		System.out.println(label.getVerticalAlignment());
		
	}

}
