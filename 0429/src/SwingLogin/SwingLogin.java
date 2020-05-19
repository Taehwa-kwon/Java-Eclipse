package SwingLogin;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingLogin extends JFrame{
     
   public SwingLogin() throws IOException {
	   
            GridLayout gl = new GridLayout(3, 2);
            this.setLayout(gl);

            JLabel lblUserId = new JLabel("아이디");
            this.add(lblUserId);
            
            JTextField id = new JTextField(10);
            this.add(id);
            
            JLabel lblUserPwd = new JLabel("비밀번호");
            this.add(lblUserPwd);
            
            JPasswordField pwd = new JPasswordField(10);
            this.add(pwd);
            
            JButton btnOk = new JButton("로그인");
            this.add(btnOk);
            
            JButton btnCancel = new JButton("취소");
            this.add(btnCancel);
            
            //이벤트 연결
            btnOk.addActionListener( new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            	String Uid = id.getText().toLowerCase().trim();
            	
				@SuppressWarnings("deprecation") // @: annotation 이라고 부르는데 컴파일러에게 설정정보를 알려준다. 바로 다음라인에만 한정적용된다.
				String Upwd =pwd.getText().toLowerCase().trim();
            	//String pwd = new String(pwPass.getPassword());
            	
            	System.out.println("로그인 버튼을 클릭하였습니다.");
               String result = getLogin(Uid,Upwd);
               System.out.println(result);
              
              
            }

			private String getLogin(String uid, String upwd)   {		//이건 액션리스너에서만 사용할꺼니깐 여기다 넣고// 아니면 아예 밖으로 빼도 아무문제 없음 .
				//여기서 파일입출력에 대한 오류를 모두 설정해야한다. surround를 해야함..try catch를 하면 안됌 
				//만약에  throws 를 하면 getLogin에 오류가 빡뜸..복잡하다.
				String result = null;
				
				File file = new File("Member.txt"); // Assembly(.class) 가 존재하는 경로(현재 경로) 즉 bin폴더가 있는곳  
				FileReader fr = null;
				BufferedReader br = null;
				
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					
					String line = "";
					while( (line=br.readLine())!=null ) {
						if(line.startsWith(uid)) {
							String [] mem = line.split(",");
							String memid = mem[0];
							String mempass = mem[1];
							String memname = mem[2];
							
					if(memid.equals(uid)) {
						if(mempass.equals(pwd)) {
							if(br!=null)br.close();
							if(fr!=null)fr.close();
							return memname;
						} else {
							if (br!=null) br.close();
							if (fr!=null) fr.close();
							return "암호가 틀립니다";
						}
					}
				}
					}
					if(br!=null) br.close();
					if(fr!=null) fr.close();
					return "아이디가 일치하지 않습니다";
				}catch (FileNotFoundException e ) {
					System.out.println("member.txt 파일없음");
				}catch (IOException e) {
					System.out.println("오류발생"+e.getMessage());
			}
				return result;
				
//				if ( uid== id.getText()  && upwd==pwd.getText() ) {
//	                  
//				 Sysstem.out.println("아이디와 비밀번호가 틀립니다.");}
//				 {
//					 System.out.println(id.getText() + "님 환영합니다");
//	               }
//				return null;
			}
         });
            
            
            
            btnCancel.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
            	if(e.getSource()==btnCancel) {
            		int exitOption = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "프로그램 종료", JOptionPane.YES_NO_OPTION);
            	 if (exitOption == JOptionPane.YES_OPTION) {
            		System.exit(JFrame.EXIT_ON_CLOSE);
            	}else if ((exitOption == JOptionPane.NO_OPTION) || (exitOption == JOptionPane.CLOSED_OPTION)) {
				return;
               
            	}}
            }
         });
            
            
            
            
            pack();
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//            this.setSize(400, 300);
            this.setVisible(true);
         }
			
        
      public static void main(String[] args) throws IOException {
            new SwingLogin();
            
        
    		
         }
}


