package ex01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingTest01_01 extends JFrame{ //1. 원래 나와있는것을 상속받아서 사용한다. 
	
		// Frame : AWT - OS의 부품(컴포넌트)를 호출 /윈도우에 있는 frame을 사용할수 있는데 그 기술이 AWT.
		// JFrame : Swing 
	//필드
	JButton btn1,btn2,btn3,btn4,btn5; //5.
	
	//생성자 
	public SwingTest01_01() { //2.생성자 실행이 진행됌
	super("스윙 테스트 연습"); 	//4.부모 생성자 호출 // 상단의 타이틀이름
	
	this.setLayout(new FlowLayout()); //5. 첫번째 FlowLayout을 설정하고 
	btn1 = new JButton("버튼1");
	btn2 = new JButton("버튼2");
	btn3 = new JButton("버튼3");
	btn4 = new JButton("버튼4");
	btn5 = new JButton("버튼5");
	this.add(btn1);
	this.add(btn2);
	this.add(btn3);
	this.add(btn4);
	this.add(btn5);
	
	
	
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(400,300);	//3.사이즈를 설정 ( this의 뜻은 프레임을 상속받은 SwingTest를 말한다.)
	this.setVisible(true);	//3.화면에 출력해라
	}
	

	public static void main(String[] args) {	
		new SwingTest01_01();// 1.생성자를 실행해라는 코드 (자기자신을 new 한다.) (아니면 맨 아래처럼 따로 따로 해야한다.)
		
	}

}

