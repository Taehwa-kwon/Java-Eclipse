package javaGUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.TextField;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
JFrame : 메인 프레임
JPanel : 보조 프레임
JLabel : 각종 UI기능을 수행하는 컴포넌트
*/

public class Gui12 {
	public static void main(String[] args) {
		Dimension dim = new Dimension (200,200);
		JFrame frame = new JFrame(" taehwa Swing ");
		
		frame.setLocation(200, 200);
		frame.setPreferredSize(dim);
		
		JPanel panel1 = new JPanel();  			//한줄 패널
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.X_AXIS)); //박스 레이아웃은 매개변수 2개를 받는다
		panel1.add(new JLabel("이름 : "));
		panel1.add(new TextField());
		
		JPanel panel2 = new JPanel();			//한줄 패널
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.X_AXIS));
		panel2.add(new JLabel("나이 : "));
		panel2.add(new TextField());
		
		JPanel panel3 = new JPanel();			//한줄 패널
		panel3.setLayout(new BoxLayout(panel3,BoxLayout.X_AXIS));
		panel3.add(new JLabel("주소 : "));
		panel3.add(new TextField());
		
		JPanel panel4 = new JPanel();			//한줄 패널
		panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS)); //패널 4는 다시 패널1~3을 세로로 입력하는 패널
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);
		
		frame.add(panel4,BorderLayout.CENTER); // 전체 패널인 4를 중앙정렬해 frame 안에 넣고
		frame.add(new JButton ("입력하기"), BorderLayout.SOUTH);	//버튼을 만들어서 frame 안에 제일 아래 배치
		frame.pack();
		frame.setVisible(true);
		
	}
}
