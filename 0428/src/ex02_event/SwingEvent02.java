package ex02_event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingEvent02 extends JFrame {
	
	JButton btn1, btn2, btn3;
	JLabel label1;
	
	//JButton [] btns;
	//ArrayList<JButton> btnList;
	
	public SwingEvent02() {
		super("SwingEvent02");
		this.setLayout( new FlowLayout());
		
		btn1 = new JButton("버튼 1");
		btn2 = new JButton("버튼 2");
		btn3 = new JButton("버튼 3");
		label1 = new JLabel ("레이블");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(label1);
												//2번쨰 이벤트 처리방법.. 중첩클래스를 활용한 방법 	
												// JFrame의 다른 컴포넌트를 조작하기 쉽다.
		btn1.addActionListener(new BtnClick() );//addActionListener 을 implement한 클래스만 넣을수 있다.]
		btn2.addActionListener(new BtnClick() );//addActionListener 을 implement한 클래스만 넣을수 있다.]
		btn3.addActionListener(new BtnClick() );//addActionListener 을 implement한 클래스만 넣을수 있다.]
		
	//	for (int i = 0; i < btns.length; i++) {

	//	System.out.println(btnList);
	//	}
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); //닫는 동작을 하면 무엇을 할것인가.  원하는 Frame만 종료시키기. 
															//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
		
	}


	public static void main(String[] args) {
		new SwingEvent02();
	}

	//내부 중첩 클래스를 활용하는 방법 -- 즉 SwingEvent02의 전체 클래스안에 내부클래스를 만드는 것임 .. 
	// 이벤트 연결을  inner class 에 코딩
	// 이렇게 해서 
	private class BtnClick implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton) e.getSource();
			String text = btn.getText();
			System.out.println(text);
			label1.setText(text+"\n"+"가으즈아. 잠온다 04/28 14:16");
		
		}
		
	}
}