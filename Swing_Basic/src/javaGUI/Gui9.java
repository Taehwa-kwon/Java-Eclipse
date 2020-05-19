package javaGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Gui9 {
	public static void main(String[] args) {
		Dimension dim = new Dimension(400,100);
		
		JFrame frame = new JFrame();
		frame.setLocation(100, 200);
		frame.setPreferredSize(dim);
		
		JTextField textField = new JTextField();
		textField.setOpaque(true);
		textField.setForeground(Color.gray);
		textField.setText(" 미리 설정 가능 " );
		
		JTextField textField2 = new JTextField();
		textField2.setEnabled(false);
		textField2.setForeground(Color.gray);
		textField2.setText(" 입력 불가 " );
		
		
		JLabel label = new JLabel("입력");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setVerticalAlignment(SwingConstants.CENTER);
		
		JButton button = new JButton("OK");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				label.setText(textField.getText());
				
			}
		});
		
		frame.add(textField,BorderLayout.CENTER);
		frame.add(textField2,BorderLayout.AFTER_LAST_LINE);
		frame.add(label,BorderLayout.NORTH);
		frame.add(button,BorderLayout.WEST);
		
		frame.pack();
		frame.setVisible(true);
		
		
		
		

	}
}
