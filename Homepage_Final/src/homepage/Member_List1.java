//회원가입 글자와 테이블 전체가 보이는 클래스
package homepage;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Member_List1 extends JFrame implements MouseListener,ActionListener {

	Vector v; 	// v=getMemberList();
	Vector cols;	//Vector를 통해서 배열을 동적인 길이로 저장.
	DefaultTableModel model;  //하나의 리모컨이라고 생각하기, 이 리모컨을 통해 각각의 테이블 데이터를 I(추가)D(삭제)A(추가)U(변경)
	JTable jTable;
	JScrollPane pane;
	JPanel pbtn;
	JButton btnInsert;
	
	public Member_List1() {
		super("회원관리 프로그램"); // JFrame 안에 저장되는것.this.setTitle 도 가능
		MemberDAO1 dao = new MemberDAO1();
		v = dao.getMemberList(); // 밑에 멤버리스트가 쫙적힘  
		cols = getColumn();	// 컬럼명이 된다.
		
		model = new DefaultTableModel(v,cols);  // 이렇게 하면 바로 변수안에 해당값이 저장되고 void 가 없으니깐 그 결과값이 상단에 저장되어짐
		//DefaultTableModel model = new DefaultTableModel(v,cols); 이렇게 사용하면 이 메소드 안에서만 사용가능함
		
		jTable = new JTable(model); //이 변경 가능한 리모컨을 jTable에 넣어서 table 을 변경가능하게 만들어주기 
		pane = new JScrollPane(jTable); // table 안에 스크롤기능 추가
		add(pane); // 앞에 아무것도 없으면 JFrame 에 저장되는거
		
		pbtn =new JPanel(); //패널을 생성해준다.
		btnInsert = new JButton("회원가입"); //회원가입이라는 버튼을 생성시켜준다
		pbtn.add(btnInsert); //패널안에 버튼을 넣어주고
		add(pbtn,BorderLayout.NORTH); //상단에 버튼을 넣어준다.
		
		jTable.addMouseListener(this); 		// 이 2개가 인터페이스를 상속받아서 그 값을 저장시켜주는 기능
		btnInsert.addActionListener(this); 	// 이 2개가 인터페이스를 상속받아서 그 값을 저장시켜주는 기능
		
		setSize(500,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Vector getColumn() {  //컬럼명   리턴이 있으니깐   
		Vector col = new Vector();
		col.add("아이디");
		col.add("비밀번호");
		col.add("이름");
		col.add("전화");
		col.add("주소");
		col.add("생일");
		col.add("직업");
		col.add("성별");
		col.add("이메일");
		col.add("자기소개");
		
		return col;	
	}
	
	//table contents update method
	public void jTableRefresh() {
		MemberDAO1 dao = new MemberDAO1();
		DefaultTableModel model = new DefaultTableModel(dao.getMemberList(),getColumn());
		jTable.setModel(model); //jTable 안에 model을 세팅해준다.
	}
	
	public static void main(String[] args) {
		new Member_List1();
	}

	
	
	//implements 인터페이스를 이용한 Event
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btnInsert) {
			new MemberProc1(this); //  이거랑 MemberProc1 클래스의 actionPerformed 의 차이는 ? new 가 있고없고..
			//여기서 new가 있다는것은 다른 클래스에 접근하기 위함
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
