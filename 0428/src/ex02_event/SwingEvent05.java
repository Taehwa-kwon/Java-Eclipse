package ex02_event;
// 인터페이스의 단점은 나는 한 가지의 마우스 제어가 필요한데 마우스 제어에 관한 모든걸 인터페이스 받아야 한다. 이게 가장 큰 문제임 
//implement로 거기에 구현된걸(예를 들어 마우스제어가 총 100개가 있다면 ) 모든걸 받아야 한다.

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//5.이벤트 처리
//Adapter 클래스 활용 : 필요한 이벤트만 사용한다. 

public class SwingEvent05 extends JFrame {
	
	JButton btn1;
	JLabel label1 = new JLabel("Hello");
	
	public SwingEvent05() {
		super("Swing Event05");
		this.setLayout(new FlowLayout());
		
		this.add(label1);
		label1.setLocation(100,50);
		
		btn1 = new JButton("버튼 1 ");
		this.add(btn1);
		
		Container c =getContentPane(); //
		// this.addMouseListener(new My_MouseAdapter() ); 이거 this는 이 SwingEvent05니깐 Title과 같은 부분도 포함해서 간격이 벌어짐. 
		c.addMouseListener(new My_MouseAdapter()); 
		
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
		
	}
	class My_MouseAdapter extends MouseAdapter{
		
		//인터페이스로 하면 alt,shift,s 하면 떠있는게 모든게 다만들어 지는데
		//이 방법은 딱 하나만 원하는거 딱하나만 구현할 수 있다.
				
		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			System.out.println("Click 위치 : " + x + "," + y );
			label1.setLocation(x, y);
			
			super.mousePressed(e);
		}		
		
		
		
	}

	public static void main(String[] args) {
		new SwingEvent05();

	}
	

}
