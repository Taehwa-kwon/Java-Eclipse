package SwingLayout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutTest extends JFrame {

	public GridBagLayoutTest() {
		setTitle("GridBagLayoutTest");
		GridBagLayout gbl = new GridBagLayout();
		this.setLayout(gbl);
		
		JButton [] btns = new JButton[5];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("버튼 "+ i);
		}
		//Constraints 제약조건 
		GridBagConstraints [] gbc = new GridBagConstraints[btns.length];
		
		gbc[0] = new GridBagConstraints(); //아이디 같은경우 무조건 필수로 넣어야하니깐 . 이게 제약조건이라는 뜻임 
		gbc[0].gridx = 0; //2. 0,1의 위치에 
		gbc[0].gridy = 1;
		this.add(btns[0],gbc[0]);	//1. 버튼의 0번째 값이
		
		gbc[1] = new GridBagConstraints(); 
		gbc[1].gridx = 0;
		gbc[1].gridy = 2;
		this.add(btns[1],gbc[1]);
		
		gbc[2] = new GridBagConstraints(); 
		gbc[2].gridx = 1;
		gbc[2].gridy = 0;
		this.add(btns[2],gbc[2]);
		
		gbc[3] = new GridBagConstraints(); 
		gbc[3].gridx = 2;
		gbc[3].gridy = 0;
		this.add(btns[3],gbc[3]);
	
		gbc[4] = new GridBagConstraints(); 
		gbc[4].gridx = 1;
		gbc[4].gridy = 1;
		gbc[4].gridwidth = 2;	// colspan
		gbc[4].gridheight = 2;	// rowspan 
		//this.add(btns[2],gbc[2]);
		gbc[4].fill = GridBagConstraints.HORIZONTAL;		//수직방향으로 늘려서 (VERTICAL) HORIZONTAL 수평  , BOTH 꽉 채워서 /// fill채운다. 
		this.add(btns[4],gbc[4]);
			
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(400,300);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new GridBagLayoutTest();

	}

}
