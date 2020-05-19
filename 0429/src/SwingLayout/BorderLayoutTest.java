package SwingLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutTest extends JFrame {

	public BorderLayoutTest() {
		this.setTitle("BorderLayout 테스트");
		this.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton ("버튼 1");
		JButton btn2 = new JButton ("버튼 1");
		JButton btn3 = new JButton ("버튼 1");
		JButton btn4 = new JButton ("버튼 1");
		JButton btn5 = new JButton ("버튼 1");
		JButton btn6 = new JButton ("버튼 1");
		JButton btn7 = new JButton ("버튼 1");
		JButton btn8 = new JButton ("버튼 1");
		
		this.add(btn1, BorderLayout.NORTH);
		this.add(btn2, BorderLayout.EAST);
		this.add(btn3, BorderLayout.SOUTH);
		this.add(btn4, BorderLayout.WEST);
		
		JPanel pan1 = new JPanel(new FlowLayout()); //프레임 > 패널 > 버튼,뭐..label등등
		pan1.add(btn5);
		pan1.add(btn6);
		pan1.add(btn7);
		pan1.add(btn8);
		this.add(pan1,BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new BorderLayoutTest();

	}

}
