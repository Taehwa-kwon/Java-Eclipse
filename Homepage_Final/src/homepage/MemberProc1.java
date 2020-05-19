//회원가입 창 
package homepage;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MemberProc1 extends JFrame implements ActionListener {

	JPanel p; // 전체 패널
	JTextField tfId, tfName, tfAddr, tfEmail; // 각각의 입력창
	JTextField tfTel1, tfTel2, tfTel3; // 각각의 전화번호 입력창
	JTextField tfYear, tfMonth, tfDate; // 생년월일 입력창
	JComboBox cbJob; // 직업 선택박스
	JPasswordField pfPwd; // 비밀번호 입력창
	JRadioButton rbMan, rbWoman; // 성별 선택 Radio
	JTextArea taIntro; // 자기소개 입력창
	JButton btnInsert, btnCancel, btnUpdate, btnDelete; // 가입 취소 수정 삭제 버튼
	GridBagLayout gb; // 엑셀처럼 셀을 병합해 사용.
	GridBagConstraints gbc; // x,y좌표 + 가로,세로 길이 지정
	Member_List1 mList;
	
	//1.사용자 지정.(윈도우빌더) - 좌표,크기를 설정해 수작업
	//2.swing에 미리 지정된 Layout관리자를 이용함.
	//FlowLayout 일렬 / borderLayout 상하좌우중앙에 요소를 단 하나씩 넣는것.
	//GridLayout n,m으로 요소들을 표처럼 정렬.   /CardLayout 카드처럼 하나씩 올리는형식
	//GridBagLayout 엑셀처럼 셀을 병합해 사용.
	//GridBagConstraints (제약/통제) x,y좌표 + 가로,세로 길이 지정
	

	public MemberProc1() { // 가입용 생성자 ?

		createUI(); // UI작성해주는 메소드
		btnUpdate.setEnabled(false);
		btnUpdate.setVisible(false);
		btnDelete.setEnabled(false);
		btnDelete.setVisible(false);

	}// 생성자

	public MemberProc1(Member_List1 mList) { //  ? 가입용 생성자

		createUI(); // UI작성해주는 메소드
		btnUpdate.setEnabled(false);
		btnUpdate.setVisible(false);
		btnDelete.setEnabled(false);
		btnDelete.setVisible(false);
		this.mList = mList;

	}// 생성자

	public MemberProc1(String id, Member_List1 mList) { // 수정/삭제용 생성자    ? 왜 매개변수로 ID를 받는지..
		createUI();
		btnInsert.setEnabled(false);
		btnInsert.setVisible(false);
		this.mList = mList;

		System.out.println("id=" + id);

		MemberDAO1 dao = new MemberDAO1();
		MemberDTO1 vMem = dao.getMemberDTO(id);  //getMemberDTO는 한사람의 회원정보를 DB에서 가져오려는 메소드
		viewData(vMem);   // ? argument 의 역할 . -> viewDate에서 매개변수로 (객체 + vMem)을 받고 객체의 변수명을 vMem으로 바꿔주고 활용 
					//id는 수정 불가하기 때문에 바로 값을 입력해줌
	}

	// MemberDTO 의 회원 정보를 가지고 화면에 셋팅해주는 메소드
	private void viewData(MemberDTO1 vMem) {  //가입용 생성자 (매개변수 1개짜리 ) 호출  
												//? argument 의 역할 . -> viewDate에서 매개변수로 (객체 + vMem)을 받고 객체의 변수명을 vMem으로 바꿔주고 활용

		String id = vMem.getId();
		String pwd = vMem.getPwd();
		String name = vMem.getName();
		String tel = vMem.getTel();
		String addr = vMem.getAddr();
		String birth = vMem.getBirth();
		String job = vMem.getJob();
		String gender = vMem.getGender();
		String email = vMem.getEmail();
		String intro = vMem.getIntro();

		// 화면에 세팅
		tfId.setText(id);
		tfId.setEditable(false); // 편집 안되게
		pfPwd.setText(""); // 비밀번호는 안보여준다.
		tfName.setText(name);
		String[] tels = tel.split("-");
		tfTel1.setText(tels[0]);
		tfTel2.setText(tels[1]);
		tfTel3.setText(tels[2]);
		tfAddr.setText(addr);

		tfYear.setText(birth.substring(0, 4));
		tfMonth.setText(birth.substring(4, 6));
		tfDate.setText(birth.substring(6, 8));

		cbJob.setSelectedItem(job);

		if (gender.equals("M")) {
			rbMan.setSelected(true);
		} else if (gender.equals("W")) {
			rbWoman.setSelected(true);
		}

		tfEmail.setText(email);
		taIntro.setText(intro);

	}// viewData

	private void createUI() { //회원가입 창
		this.setTitle("회원정보"); // ? 그럼 Member_List super이랑 다른게 뭐야 super해서 사용해도 됌
		gb = new GridBagLayout(); // 엑셀처럼 셀병합해서 사용하는 Layout
		setLayout(gb);
		gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;

		// 아이디
		JLabel bId = new JLabel("아이디 : ");
		tfId = new JTextField(20);
		// 그리드백에 붙이기 2. gbAdd 메소드로 ㄱ
		gbAdd(bId, 0, 0, 1, 1); // 앞에 x,y 0,0기준 1,1 높이 길이
		gbAdd(tfId, 1, 0, 3, 1); // x,y 1,0기준

		// 비밀번호
		JLabel bPwd = new JLabel("비밀번호 : ");
		pfPwd = new JPasswordField(20);
		gbAdd(bPwd, 0, 1, 1, 1);
		gbAdd(pfPwd, 1, 1, 3, 1);

		// 이름
		JLabel bName = new JLabel("이름 :");
		tfName = new JTextField(20);
		gbAdd(bName, 0, 2, 1, 1);
		gbAdd(tfName, 1, 2, 3, 1);

		// 전화
		JLabel bTel = new JLabel("전화 :");
		JPanel pTel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // 가로로 적은 layout 왼쪽부터 시작 , 패널을 만든다.
		tfTel1 = new JTextField(6);
		tfTel2 = new JTextField(6);
		tfTel3 = new JTextField(6);
		pTel.add(tfTel1);
		pTel.add(new JLabel(" - "));
		pTel.add(tfTel2);
		pTel.add(new JLabel(" - "));
		pTel.add(tfTel3);
		gbAdd(bTel, 0, 3, 1, 1);
		gbAdd(pTel, 1, 3, 3, 1);

		// 주소
		JLabel bAddr = new JLabel("주소: ");
		tfAddr = new JTextField(20);
		gbAdd(bAddr, 0, 4, 1, 1);
		gbAdd(tfAddr, 1, 4, 3, 1);

		// 생일
		JLabel bBirth = new JLabel("생일: ");
		tfYear = new JTextField(6);
		tfMonth = new JTextField(6);
		tfDate = new JTextField(6);
		JPanel pBirth = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pBirth.add(tfYear);
		pBirth.add(new JLabel("/"));
		pBirth.add(tfMonth);
		pBirth.add(new JLabel("/"));
		pBirth.add(tfDate);
		gbAdd(bBirth, 0, 5, 1, 1);
		gbAdd(pBirth, 1, 5, 3, 1);

		// 직업
		JLabel bJob = new JLabel("직업 : ");
		String[] arrJob = { "---", "학생", "직장인", "주부" };
		cbJob = new JComboBox(arrJob);
		JPanel pJob = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pJob.add(cbJob);
		gbAdd(bJob, 0, 6, 1, 1);
		gbAdd(pJob, 1, 6, 3, 1);

		// 성별
		JLabel bGender = new JLabel("성별 : ");
		JPanel pGender = new JPanel(new FlowLayout(FlowLayout.LEFT));
		rbMan = new JRadioButton("남", true);
		rbWoman = new JRadioButton("여", true);
		ButtonGroup group = new ButtonGroup();
		group.add(rbMan);
		group.add(rbWoman);
		pGender.add(rbMan);
		pGender.add(rbWoman);
		gbAdd(bGender, 0, 7, 1, 1);
		gbAdd(pGender, 1, 7, 3, 1);

		// 이메일
		JLabel bEmail = new JLabel("이메일 : ");
		tfEmail = new JTextField(20);
		gbAdd(bEmail, 0, 8, 1, 1);
		gbAdd(tfEmail, 1, 8, 3, 1);

		// 자기소개
		JLabel bIntro = new JLabel("자기 소개: ");
		taIntro = new JTextArea(5, 20); // 행 : 열
		JScrollPane pane = new JScrollPane(taIntro);
		gbAdd(bIntro, 0, 9, 1, 1);
		gbAdd(pane, 1, 9, 3, 1);

		// 버튼
		JPanel pButton = new JPanel();
		btnInsert = new JButton("가입");
		btnUpdate = new JButton("수정");
		btnDelete = new JButton("탈퇴");
		btnCancel = new JButton("취소");
		pButton.add(btnInsert);
		pButton.add(btnUpdate);
		pButton.add(btnDelete);
		pButton.add(btnCancel);
		gbAdd(pButton, 0, 10, 4, 1);

		// 버튼에 감지기를 붙이자
		btnInsert.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnCancel.addActionListener(this);
		btnDelete.addActionListener(this);

		setSize(350, 500);
		setVisible(true);
		// setDefaultCloseOperation(EXIT_ON_CLOSE); //System.exit(0) //프로그램종료
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); // dispose(); //현재창만 닫는다.

	}// createUI

	// 3. 그리드백레이아웃에 붙이는 메소드
	private void gbAdd(JComponent c, int x, int y, int w, int h) {
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		gb.setConstraints(c, gbc); // GridBagLayout gb; // ?
		gbc.insets = new Insets(2, 2, 2, 2); // ? input 창의 크기
		add(c, gbc); // 바로 프레임안에 저장가능
	}// gbAdd

	public static void main(String[] args) {

		new MemberProc1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnInsert) { // 가입 버튼을 누르면 getSource() 어느 버튼이 눌러졌는지 구분하기 위함
			insertMember(); // 이 해당 클래스안에 insertMember이 있으니깐 new 없이 접근 가능
			System.out.println("insertMember() 호출 종료");
		} else if (e.getSource() == btnCancel) {
			this.dispose(); // 창닫기 (현재창만 닫힘)
			// system.exit(0)=> 내가 띄운 모든 창이 다 닫힘
		} else if (e.getSource() == btnUpdate) {
			UpdateMember();
		} else if (e.getSource() == btnDelete) {
			// int x = JOptionPane.showConfirmDialog(this,"정말 삭제하시겠습니까?");
			int x = JOptionPane.showConfirmDialog(this, "정말 삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION);

			if (x == JOptionPane.OK_OPTION) {
				deleteMember();
			} else {
				JOptionPane.showMessageDialog(this, "삭제를 취소하였습니다.");
			}
		}

		// jTable내용 갱신 메소드 호출
		mList.jTableRefresh();

	}// actionPerformed

	private void deleteMember() {
		String id = tfId.getText();
		String pwd = pfPwd.getText();
		if (pwd.length() == 0) { // 길이가 0이면

			JOptionPane.showMessageDialog(this, "비밀번호를 꼭 입력하세요!");
			return; // 메소드 끝
		}
		// System.out.println(mList);
		MemberDAO1 dao = new MemberDAO1();
		boolean ok = dao.deleteMember(id, pwd); // dao 에서 그 값들을 가져온다.

		if (ok) {
			JOptionPane.showMessageDialog(this, "삭제완료");
			dispose(); //창닫기

		} else {
			JOptionPane.showMessageDialog(this, "삭제실패");

		}

	}// deleteMember

	private void UpdateMember() {

		// 1. 화면의 정보를 얻는다.
		MemberDTO1 dto = getViewData(); // getview에서 가져와서 dto에 저장.
		// 2. 그정보로 DB를 수정
		MemberDAO1 dao = new MemberDAO1();
		boolean ok = dao.updateMember(dto);

		if (ok) {
			JOptionPane.showMessageDialog(this, "수정되었습니다.");
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(this, "수정실패: 값을 확인하세요");
		}
	}

	private void insertMember() {

		// 화면에서 사용자가 입력한 내용을 얻는다. 
		// 1. Actionperform에서 insertmember 을 실행 -> 2.MemberDTO1 dto = getViewData()메소드를 통해서 입력한 값들을 dto.set으로 dto에 저장하고
		// 3. dto에서 insertMember 메소드에서 resultSet이 없으니 값들을 db에 전송한다.
		MemberDTO1 dto = getViewData();
		MemberDAO1 dao = new MemberDAO1();
		boolean ok = dao.insertMember(dto);

		if (ok) {

			JOptionPane.showMessageDialog(this, "가입이 완료되었습니다.");
			dispose();

		} else {

			JOptionPane.showMessageDialog(this, "가입이 정상적으로 처리되지 않았습니다.");
		}

	}// insertMember

	public MemberDTO1 getViewData() { // ? 업데이트 했을때 ? 사용되는것?

		// 화면에서 사용자가 입력한 내용을 얻는다.
		MemberDTO1 dto = new MemberDTO1();
		String id = tfId.getText(); // 
		String pwd = pfPwd.getText();
		String name = tfName.getText();
		String tel1 = tfTel1.getText();
		String tel2 = tfTel2.getText();
		String tel3 = tfTel3.getText();
		String tel = tel1 + "-" + tel2 + "-" + tel3;
		String addr = tfAddr.getText();
		String birth1 = tfYear.getText();
		String birth2 = tfMonth.getText();
		String birth3 = tfDate.getText();
		// String birth = birth1+"/"+birth2+"/"+birth3;
		String birth = birth1 + birth2 + birth3;
		String job = (String) cbJob.getSelectedItem();
		String gender = "";
		if (rbMan.isSelected()) { // rbMan 남자 rbWoman 여자 isSelected선택박스가 선택되었는지 아닌지 확인
			gender = "M";
		} else if (rbWoman.isSelected()) {
			gender = "W";
		}

		String email = tfEmail.getText();
		String intro = taIntro.getText();

		// ? dto에 담는다.dto에 담는다는 것은 데이터를 저장하겠다는것인가?
		// 프로세스가 회원가입 창에 어떤 값을 입력하면 getText해서 값을 가져와서 DTO에 저장하고 DAO에서 DTO를 호출해서 값을 DB에 저장한다.
		// 또한 가져올떄는 DAO에서 getMember해서 값을 DB에서 가져오기도 한다.
		// ? 근데 궁금한게 회원가입, 수정, 삭제, 읽기도 하는데 아무런 순서가 없는것 같음. dto에 많은 정보를 왔다갔다 하는데 어떻게 컴퓨터가 구별해서 맞는정보를 가져오는지.. 
		dto.setId(id);
		dto.setPwd(pwd);
		dto.setName(name);
		dto.setTel(tel);
		dto.setAddr(addr);
		dto.setBirth(birth);
		dto.setJob(job);
		dto.setGender(gender);
		dto.setEmail(email);
		dto.setIntro(intro);

		return dto;
	}

}// end
