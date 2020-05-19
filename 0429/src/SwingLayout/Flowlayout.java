package SwingLayout;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Flowlayout extends JFrame {

	JButton btn1,btn2,btn3;
	
	public Flowlayout() {
		this.setTitle("FlowLayout 예제");
		
		//getContentPane().setLayout(mgr);
		
		JButton [] btns = new JButton[5];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("버튼 " + i);
			this.add(btns[i]);
		}
		
		List<JButton> btnList =new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			btnList.add(new JButton("버튼"+(i+1)));
			add(btnList.get(i)); //추가된 i 번째것
			btnList.get(i).addActionListener((e)->{
				
			JButton btn = (JButton) e.getSource();
			String msg = btn.getText(); 
				//String msg = btnList.get(i).getText();
			System.out.println(msg);
				
			});
		}
		
		/*
		btn1 = new JButton("버튼1");
		btn2 = new JButton("버튼1");
		btn3 = new JButton("버튼1");
		
		this.add(btn1);
		this.add(btn2);
		this.add(btn3);
		*/
		
		
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(300,300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Flowlayout();

	}

}
