package homeWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HomeWork {


	public static void main(String[] args) {
		File file = new File("C:/tmp/zipcode33.txt");
	
		FileReader 		fr = null;
		BufferedReader 	br = null;
		FileWriter 		fw = null;
		BufferedWriter 	bw = null;
		
		try {
			fr 	= new FileReader(file);
			br	= new BufferedReader(fr);
			
			//=============================필요변수==============================//
			String line = "";	//한 줄에 대한 내용을 담는 변수
			//==================================================================//
			
			br.readLine(); //타이틀을 단순히 읽는다.(저장 x) 
		
			int sidoCount = 0;
			System.out.println("1.서울 2.부산 3.대구 4.인천 5.광주 6.대전 7.울산 8.세종 9.강원 10.경기 11.경남 12.경북 13.전남 14.전북 15.제주 16.충남 17.충북 ");
			
			while((line = br.readLine())!=null) {
				
				String ZIPCODE ="";	//우편번호
				String SIDO	= "";	//시,도
				String GUGUN = "";	//구,군
				String DONG	= "";	//동
				String BUNJI= "";	//번지
				String SEQ = "";		//SEQ
				String selectNum ="";//Num
				String search = "";	// 검색하고자 하는 내용을 담는 변수
				String prevSido ="";
				

				String [] str = line.split(",");
				ZIPCODE = str[0];		
				SIDO = str[1];
				GUGUN = str[2];
				DONG = str[3];
				BUNJI = str[4];
				SEQ= str[5];
				
				Scanner in = new Scanner(System.in);
				for (int i = 0; i < args.length; i++) {
					//여기서 어떤값을 넣었을때 출력되는거 
				}
//=====================================================================================================//				
				if(!SIDO.equals(prevSido)) {	//앞에것을 기준으로  뒤에것과 비교한다. sidoList와 str[1]과 같지않다면
					sidoCount++;
				
				String oPath = "c:/tmp/"+"1"+ SIDO + ".text";
				fw =new FileWriter(oPath);
				fw.close();
				prevSido = SIDO;
				}
				
				String oPath = "c:/tmp/"+"1"+ prevSido + ".text";
				fw = new FileWriter(oPath,true);
				bw = new BufferedWriter(fw);
				bw.write(line+ "\n");
				bw.flush();
				System.out.println(sidoCount+ "," + line);
				
				sidoCount++;
				bw.close();
				fw.close();
			}
//=====================================================================================================//			
			
			System.out.println("완료");
		
	
	/*----------------------------------------*/
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다." + e.getMessage());
		} catch (IOException e) {
			System.out.println("입출력 오류 발생" + e.getMessage());
		} catch (Exception e) {
			System.out.println("일반 오류 발생" + e.getMessage());
		}finally {
			//2. surround fr.close();
			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
  			} catch (IOException e) {
			}
		}
	}
}
