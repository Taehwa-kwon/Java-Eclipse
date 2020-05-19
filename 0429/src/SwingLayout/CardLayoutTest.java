package SwingLayout;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutTest extends JFrame{
		CardLayout card;
		Container c;	//무엇을 담는 그릇.
	
	public CardLayoutTest() {
		setTitle("cardLayoutTest");
		
		c	=this.getContentPane();	//container에 값을 담는다.
		card=new CardLayout(60,30);	// x축40  y 축 간격 바깥쪽에서의 간격 (即 Margin）（Padding은 ）  마진이 Frame과의 거리 / 테두리 / padding은 테두리와 컨텐츠간의 간격
		c.setLayout(card);
		
		JButton btn1 = new JButton("버튼 1 ");
		JButton btn2 = new JButton("버튼 2 ");
		JButton btn3 = new JButton("버튼 3 ");
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		btn1.addActionListener(new ButtonListener());
		btn2.addActionListener(new ButtonListener());
		btn3.addActionListener(new ButtonListener());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			card.next(c);
		}
	}

	public static void main(String[] args) {
		new CardLayoutTest();

	}

}
