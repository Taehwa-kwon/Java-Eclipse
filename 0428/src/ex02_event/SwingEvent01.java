package ex02_event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class EventA implements ActionListener{	//1. 인터페이스 implements 를 한것만 

	@Override
	public void actionPerformed(ActionEvent e) { //3. 인터페이스는 반드시 ovverride 해야함, 버튼에 관한 정보들을 e 에 보관 됌.
						//4. 버튼은 SwingEvent01 에 있는것을 사용하고 있다. 문제점은 여기 EventA의 클래스는 SwingEvent01과 서로 모르는 사이다.(서로 다른 메모리니깐)
//		e.getSource(); 	//5. (Object 타입) 그래서 여기서 이 버튼의 메모리의 위치,여러 정보를 e에 저장되어있는데 그 정보를 가져오는것.
		
		
		JButton btn1 = (JButton) e.getSource(); //(Object 타입) 이벤트를 발생시킨 componenet를 알아낸다.
		System.out.println(e.toString());
		
		String text = btn1.getText(); //set , get
		System.out.println(text + "가 눌러졌습니다.");
		//btn1.setText("후후");
	}
	//----------------문제점 ------------------------------//
	// 이렇게 되면 버튼을 누를때마다 새로운 클래스를 만들어야 해서 너무 불편함 -----//
	// label을 넣기도 쉽지않음 
}


public class SwingEvent01 extends JFrame {

	JButton btn1,btn2,btn3;
	JLabel label1;
	
	public SwingEvent01() {
		super("Swing_Event");
		 
		setLayout(new FlowLayout());
		
		btn1 = new JButton("我是按钮"); // = btn1.setText(text);
		btn2 = new JButton("我是权泰华"); 
		btn3 = new JButton("我是Taehwa"); 
		label1 = new JLabel("我是Taehwa"); 
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		this.add(label1);
		btn1.addActionListener(new EventA());  //2. 여기에는 반드시 class만 넣을수 있고, 이 버튼에 관한걸 사용할 수 있다.

		
		setSize(400,300);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SwingEvent01();

	}

}

//JFrame fr = new JFrame("This 프레임");
//JPanel pn = new JPanel();
//JButton[] bt = new JButton[10];
//
//FlowLayout fl = new FlowLayout();
//fl.setAlignment(FlowLayout.CENTER);
//pn.setLayout(fl);
