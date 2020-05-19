package io2_2; // append 기능

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class TestReaderWriter2 {
	

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
			
			char firstChar;
			int totalAdd = 0;
			int [] addTotal = new int [3];
			
			while((line=br.readLine())!=null) {	//while (true)일때 반복 (false)일떄 반복이 종료
				String name = line;				//예를들어 공백인 셀이 있으면 null로 종료되나? 그런건 아니다. \n도 인식한다.
				
				String FirstName = name.substring(0,1);
				String LastName = name.substring(1,3);
				String [] add = name.split(",");	//이걸로 2부분으로 나눔
				
				
				String team = "";
				
				firstChar = FirstName.charAt(0);
				if('가'<=firstChar && firstChar<='낗') {
					team= "1팀";
				}
				if('바'<=firstChar && firstChar<='삫') {
					team= "2팀";
				}
				if('사'<=firstChar && firstChar<='앃') {
					team= "3팀";
				}
				if('아'<=firstChar && firstChar<='잏') {
					team= "4팀";
				}
				if('자'<=firstChar && firstChar<='찧') {
					team= "5팀";
				}
				if('차'<=firstChar && firstChar<='칳') {
					team= "6팀";
				}
				// add[0]		이건 앞쪽 (이름:권태화) 이까지 ","이것을 기준으로 나눔   
				String address = add[1].trim();		
				
				switch(address) {
				case "남구": addTotal[0]++; break;
				case "북구": addTotal[1]++; break;
				case "동구": addTotal[2]++; break;
				
				}
				totalAdd++;
				
				String fmt = "번호:%03d  이름:%s \t"
						+ " %s  %s, %s %s %s \n";
				String msg = String.format(fmt, num,name,FirstName,LastName,address,firstChar,team);
				System.out.println(msg);
				bw.write(msg); //이건 파일에 저장하는것 
				
				num++; //번호를 추가
			}
			
			String fmt ="남구인원 : %d\t 북구인원 : %d\t  동구인원 : %d\t";
			String msg =String.format(fmt, addTotal[0],addTotal[1],addTotal[2]);
			bw.write(msg);
			
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

		
	
	
	
	