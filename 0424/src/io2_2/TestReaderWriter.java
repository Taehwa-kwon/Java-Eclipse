package io2_2; // append 기능

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReaderWriter {

	public static void main(String[] args) throws IOException {

		File file1 = new File("c:/tmp/names.txt");
		File file2 = new File("c:/tmp/names_result.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
				
			String line = "";
			int num = 1;						//readLine 이 실행할떄마다 내려간다. 
			while((line=br.readLine())!=null) {	//while (true)일때 반복 (false)일떄 반복이 종료
				String name = line;				//예를들어 공백인 셀이 있으면 null로 종료되나? 그런건 아니다. \n도 인식한다.
				
				String fmt = "%02d. : %s "+"\n";
				String msg = String.format(fmt, num,name);
				System.out.println(msg); 
				bw.write(msg); //이건 파일에 저장하는것 
				
				num++; //번호를 추가
			}
			System.out.println("작업을 완료하였습니다");
			
		}catch (FileNotFoundException e) {
			System.out.println("파일 존재하지 않습니다."+e.getMessage());	//파일이 없으면..
		
		}catch (IOException e) {
			System.out.println("오류발생"+e.getMessage());
		
		}finally {
			try {
				if(fr!=null)br.close();
				if(br!=null)fr.close();
				if(fw!=null)bw.close();
				if(bw!=null)fw.close();
			}catch(IOException e) {}
		}
		
		fr.close();
		
		
	
	
	
	
	}
}
