package io2_2;//throws를 하지 않았을때 예제 


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter2 {

	public static void main(String[] args) {
		String path = "c:/tmp/"; // 이거랑
		String filename = "out.kth"; // 이거 두개 합친것이 String filename = "c:/tmp/out.ktw;"		나누기 혹은 역슬래쉬 2개는 폴더이다. 예를 들어 주소창 같은 경우
		String filepath	= path + filename; 
		// filename 에 경로를 모두 합친경우도 있고
		// filepath 에 두개를 따로 붙이는 경우도 있고
		// 다 같은 방법이긴 함
		//ctrl+ r = c:\tmp 이렇게 바로 폴더창 접속 가능
		
		File file = new File(filepath);
		FileWriter fw = null;		// new 하면 open이 자동으로 된다.
									// try catch안에서 사용하기 위해서 여기서 선언한다.

		try {
			fw = new FileWriter(file);			//open 
			fw.write("Hello");		
			fw.close();		//close 는 반드시 try catch 안에 있어야함.. 사실 제일 좋은건 throws 하는게 제일 좋음
			System.out.println("저장되었습니다.");
			
		} catch (IOException e) {
			System.out.println("파일 저장 중 ... 오류 발생 \n 112에 전화하세요" + e.getMessage());
		
//			try {
//				bw.close();
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
		} finally { 			//finally는 try - catch 정상 실행되어도 finally로 돌아오고 catch 정상 저장이 안되어도 finally로 돌아와서 파일 종료시킴
								//fw.close(); //또 예외처리 이거 f2 한게 아래의 내용
			try {						// 진정한 finally는 마지막에도 try, catch를 해준다.
				if(fw!=null)			//이게 최종 구문
				fw.close();
			} catch (IOException e) {		//null이되면 실행이 안되는거니깐 여기에는 close 메소드를 넣을 필요는 없지.
				}
			}
	}

}
