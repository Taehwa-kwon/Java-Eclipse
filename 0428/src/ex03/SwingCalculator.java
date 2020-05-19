package ex03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SwingCalculator extends JFrame implements ActionListener{

	JTextField txt1, txt2;
	JButton btn1,btn2,btn3,btn4,btn5;
	JLabel label1;
	JPanel panel1;
	public int x=0;
	public int y=0;
	public int result =0;
	
	public SwingCalculator() {
		this.setTitle("계산기"); // super 이랑 똑같음.
		getContentPane().setLayout(new FlowLayout());
		
		txt1 = new JTextField(25);
		txt1.setHorizontalAlignment(SwingConstants.RIGHT);
		txt2 = new JTextField(25);
		btn1 = new JButton("+");
		btn2 = new JButton("-");
		btn3 = new JButton("*");
		btn4 = new JButton("/");
		btn5 = new JButton("%");
		label1 = new JLabel("   출력창 : ");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		
		getContentPane().add(txt1);
		getContentPane().add(txt2);
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		getContentPane().add(btn3);
		getContentPane().add(btn4);
		getContentPane().add(btn5);
		getContentPane().add(label1);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn1) {
			 x = Integer.parseInt(txt1.getText());
			 y = Integer.parseInt(txt2.getText());
			 String plusResult = Integer.toString(x+y);
			 	//String result = Integer.toString(plusResult);
			 	label1.setText(plusResult);
		} 
	}

	public static void main(String[] args) {
		new SwingCalculator();
		}
	}

