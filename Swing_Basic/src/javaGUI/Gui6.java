//GridLayout
package javaGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Gui6 {

	public static void main(String[] args) {
		Dimension dim = new Dimension(200,400); //swing 창의 전체 크기
		
		JFrame frame = new JFrame("태화의 Swing");   //프레임의 이름 설정과 객체 생성
		frame.setLocation(0, 100); 					// 프레임의 시작위치
		frame.setPreferredSize(dim);				//프레임의 크기 설정을 실행시켜주는 
		
		GridLayout layout = new GridLayout(3,1);
		frame.setLayout(layout);
		
		
		JButton button = new JButton();
		
		button.setText("더하기");
		button.setOpaque(true);//색상을 적용하겠다는 기본 메소드
		button.setBackground(Color.black);
		button.setForeground(Color.RED);
		
		JButton button2 = new JButton();
		button2.setText("뺴기");
		button2.setBackground(Color.black);
		button2.setForeground(Color.RED);
		
		button.setVerticalAlignment(SwingConstants.CENTER); // 세로
		button.setHorizontalAlignment(SwingConstants.CENTER); // 가로
		
		button2.setVerticalAlignment(SwingConstants.CENTER); // 세로
		button2.setHorizontalAlignment(SwingConstants.CENTER); // 가로
		
		JLabel label = new JLabel("0");
		
		//Override
		ActionListener listener = new ActionListener() {		//actionListener(인터페이스) 버튼이 클릭 되었을때 
			public void actionPerformed(ActionEvent e) {  		//actionPerformed 는 콜백 메소드. 즉 버튼을 누르면 해당 메소드 실행문이 실행됌  
				//if(e.getSource() == button ) {
				label.setText(String.valueOf(Integer.valueOf(label.getText())+1));
			//} else if (e.getSource() == button2 ) {
				//label.setText(String.valueOf(Integer.valueOf(label.getText())-1));
			//} else {} } 
		}};
		
		ActionListener listener2 = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(String.valueOf(Integer.valueOf(label.getText())-1));
			}
		};
		
		button.addActionListener(listener);
		button2.addActionListener(listener2);
		
		
		
		frame.add(button); // 프레임안에 각각의 라벨을 넣어줌
		frame.add(label);	// 프레임안에 각각의 라벨을 넣어줌
		frame.add(button2);
		
		frame.pack(); // 이게 없으면 최소화의 창 만을 보여
		frame.setVisible(true);  // 프레임을 보여주게 만든다.

	}

}
