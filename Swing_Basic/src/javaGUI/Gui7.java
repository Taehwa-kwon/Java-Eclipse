//GridLayout
package javaGUI;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui7 extends JFrame implements ActionListener{
	private JLabel label, label1;
	private JButton button, button1, button2;
	private int count = 0;
	
	public Gui7() {
		JPanel panel = new JPanel () ;     	// Counter 이라는 상단 패널을 하나 두고
		label = new JLabel("Counter");		//	label로 텍스트 내용을 저장
		panel.add(label);					//	라벨을 패널에 다시 저장
		
		label1 = new JLabel(""+count);		// 카운터하는 숫자를 저장 
		label1.setFont(new Font("궁서",Font.BOLD | Font.ITALIC,50));   // 이름, 폰트 , 글자 크기 
		panel.add(label1);					// label 과 label1을 패널1로 모아서 저장
		
		
		JPanel panel_b = new JPanel();		
		button = new JButton("카운터 증가");
		button1 = new JButton("카운터 감소");
		button2 = new JButton("카운토 초기화");
		panel_b.add(button);
		panel_b.add(button1);
		panel_b.add(button2);
		panel.add(panel_b);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		add(panel);  // ?
		setSize(400,400);
		setTitle("My Computer");
		setVisible(true);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button ) {
			count ++;
			label1.setText(count + "");
		} else if (e.getSource() == button1) {
			count --;
			label1.setText(count + "");
		} else {
			count = 0;
			label1.setText(count + "");
		}
		
	}



	public static void main(String[] args) {
		new Gui7();
	}
}
