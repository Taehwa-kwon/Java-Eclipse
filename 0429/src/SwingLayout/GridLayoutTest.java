package SwingLayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest extends JFrame {

	public GridLayoutTest() {
		setTitle("GridBagLayoutTest");
		GridLayout gbl = new GridLayout(3,2);
		this.setLayout(gbl);
		
		JButton [] btns = new JButton[52];
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("버튼 "+ i);
			this.add(btns[i]);
			
			this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			this.setSize(400,300);
			this.setVisible(true);
		}
		
	}

	public static void main(String[] args) {
		new GridLayoutTest();

	}

}
