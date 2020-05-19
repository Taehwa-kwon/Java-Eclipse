//ArrayList 로 바꾸고 

package javaGUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Gui14 {
	public static void main(String[] args) {
		Dimension dim = new Dimension(400,300);
		JFrame frame = new JFrame("Taehwa Swing");
		frame.setLocation(0, 100);
		frame.setPreferredSize(dim);
		
		String header [] = {"학생이름","국어","영어","수학"};
		String contents[][] = {
				{"권태화","80","80","90"},
				{"홍길동","10","100","50"},
				{"세종대왕","100","7","100"}
		};
		DefaultTableModel model = new DefaultTableModel(contents,header); // 하나의 리모컨이라고 생각하기 , 이 리모컨을 통해서 각각의 테이블 데이터를 수정변경추가가능
		JTable table = new JTable(model);
		JScrollPane scrollpane = new JScrollPane(table);
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		JTextField nameField = new JTextField(10); // 필드창의 크기
		JTextField subject1 = new JTextField(1); // 3
		JTextField subject2 = new JTextField(1); // 3
		JTextField subject3 = new JTextField(1); // 3
		
		panel.add(nameField);
		panel.add(subject1);
		panel.add(subject2);
		panel.add(subject3);
		
		
		
		
		JButton addBtn = new JButton("추가");
		addBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String inputStr[] = new String [4];
				
				inputStr[0] = nameField.getText();
				inputStr[1] = subject1.getText();
				inputStr[2] = subject2.getText();
				inputStr[3] = subject3.getText();
				model.addRow(inputStr);  //model 리모컨을 가지고 데이터를 입력하는 구절. TextField에서 입력 받은 데이터로 문자열 배열을 만들어 addRow메소드로 입력
				
				nameField.setText("");
				subject1.setText("");
				subject2.setText("");
				subject3.setText("");
			}
		});
		
		JButton cancelBtn = new JButton("삭제");
		cancelBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow() == -1) { // getSelectedRow() 로 선택된셀이 있는지 검사하고  아무것도 선택하지 않았을때 기본 디폴트값이 -1이다. 그래서  
					return;
				}
				else {
					model.removeRow(table.getSelectedRow()); //있다면 removeRow() 메소드로 삭제
				}
			}
		});
		
		panel.add(addBtn);
		panel.add(cancelBtn);
		
		frame.add(scrollpane,BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
		
		
	}
}
