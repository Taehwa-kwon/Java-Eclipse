package ex02_event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!
public class SwingEvent04 extends JFrame{
	JButton btn1;
	JTextField txt1;
	JLabel label1;
	
	public SwingEvent04(){
		super("SwingEvent04");
		this.setLayout(new FlowLayout());
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		this.add(txt1);
		
		btn1 = new JButton("버튼 1");
		this.add(btn1);
		
		label1 = new JLabel();
		this.add(label1);
		
		
		//익명 클래스 기법 
		btn1.addActionListener(new ActionListener() { //4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(e.toString());
				String txtString = txt1.getText();
				System.out.println(txtString);
				label1.setText(txt1.getText());
				
			}
		});
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEvent04();
	}
}
