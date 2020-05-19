package ex02_event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//3번째 이벤트 연결 방법!!!!!!3번째 이벤트 연결 방법!!!!!!3번째 이벤트 연결 방법!!!!!!3번째 이벤트 연결 방법!!!!!!3번째 이벤트 연결 방법!!!!!!

//2. add unimplements 추가하기 
public class SwingEvent03 extends JFrame implements ActionListener {	//1.먼저 이렇게 적고
	JButton btn1;
	JLabel label1;
	
	
	public SwingEvent03() {
		super("Swing Event03");
		this.setLayout(new FlowLayout());
		
		btn1 = new JButton("버튼1");
		this.add(btn1);
		btn1.addActionListener(this); //4. 버튼 1에 이벤트를 다는데
		
		label1 = new JLabel();
		this.add(label1);

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
		}
	
	//add unimplements 추가하기 
	public static void main(String[] args) {
		new SwingEvent03();
	}
	
	
	@Override //3.이게 추가됌
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource(); //5.이벤트를 서로 연결해주고
		label1.setText(btn.getText()+"이 눌러졌습니다.");
		
	}
}
