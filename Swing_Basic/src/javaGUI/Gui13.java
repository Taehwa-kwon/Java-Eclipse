package javaGUI;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class Gui13 {
	public static void main(String[] args) {
		Dimension dim = new Dimension(200,200);
		JFrame frame = new JFrame("taehwa Swing");
		frame.setLocation(200, 200);
		frame.setPreferredSize(dim);
		
		//String [] header  = {"학생이름", "국어","영어","수학"};
		String [] header = new String [] {"학생이름", "국어","영어","수학"};
		String contents[][] = {
				{"권태화","80","80","90"},
				{"홍길동","80","80","80"},
				{"세종대왕","80","80","80"}
		};
		
		
		
		JTable table = new JTable(contents,header);
		JScrollPane scrollPane = new JScrollPane(table);
		frame.add(scrollPane);
		frame.pack();
		frame.setVisible(true);

		
		
		//==========================set,get ValueAt() =======================================//
		
		table.setValueAt("100",1,1);
		System.out.println("1,1의 값을 나타내시오 : " + table.getValueAt(1,1));
		System.out.println("RowCount : " + table.getRowCount());
		System.out.println("getColumnName : " + table.getColumnName(0));
		System.out.println("getValueAt : " + table.getValueAt(0, 3));
		//==========================set,get ValueAt() =======================================//		
		
	}
}
