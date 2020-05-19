package ex02_event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!
public class SwingEvent04_01 extends JFrame{
	JButton btn1;
	JTextField txt1;
	
	public SwingEvent04_01(){
		super("SwingEvent04");
		this.setLayout(new FlowLayout());
		
		txt1 = new JTextField();
		txt1.setColumns(10);
		this.add(txt1);
		
		btn1 = new JButton("버튼 1");
		this.add(btn1);
		
//		//익명 클래스 기법
//		btn1.addActionListener(new ActionListener() { //4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!4번째 이벤트 처리방법!!
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println(e.toString());
//				String txtString = txt1.getText();
//				System.out.println(txtString);
//			}
//		});
		/*람다식 기법*/
		btn1.addActionListener( ( e ) -> {		//e인자를 받아서 ..아래의 str과 같다.
			System.out.println(e.toString());
			String txtString = txt1.getText();
			System.out.println(txtString);
		});
		
		//========================람다식 구조=============================================
		// ()->{							//1. 람다식 -- 인자가 없는것을 받아서 함수명을 빼고 
		// System.out.println();
		//}
		
		//function () {						//1. 기존 -- 앞에 function이 (->) 이게 되는거야 .function뒤의  
		//System.out.println("");
		// }
		
		//(str)->{
		//return str.toUpperCase();			//2.람다식 -- 인자가 str인 것을 받아서 대문자로 바꿔준다.
		//}
		
		//display(str){						//2.기존 -- 앞에 display의 함수명을 빼고 위에처럼 적는게 
		//return str.toUpperCase();
		//}
		//================================================================================
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingEvent04_01();
	}
}
