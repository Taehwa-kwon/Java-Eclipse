package HomeWork2.copy;

//세로로 배열을 만들어서 원하는 값을 입력했을때 같은값을 출력하면된다.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) throws IOException {
		File file1 = new File("/Users/gray/Desktop/java/zipcode.csv");
		File file2 = new File("/Users/gray/Desktop/java/zipcode_result123123.csv");
		
		FileReader		 fr 	=	null;
		BufferedReader	 br		=	null;
		FileWriter		 fw		=	null;
		BufferedWriter	 bw		=	null;
		
		try {
			fr = new FileReader(file1);
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "euc-kr"));
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			System.out.println("----------------------------------------------");
			System.out.println("|       다음 중 원하시는 목록을 선택하시오            |");
			System.out.println("| ZIPCODE , SIDO , GUGUN , DONG , BUNJI , SEQ |");
			System.out.println("|                나가기(EXIT)                  |");
			System.out.println("----------------------------------------------");
			System.out.println("");
			Scanner in = new Scanner(System.in);
			String selectNum = in.next();	//ZIPCODE , SIDO , GUGUN , DONG , BUNJI  목록	
			//nextLine은  enter 전까지 모두 저장하고 next 는 스페이스 즉 공백 전까지 입력받은 문자열을 리턴한다는 것이다.
			String search = "";	// 검색하고자 하는 내용
			String line = "";	// 메모장에 있는 한 줄에 대한 내용.
			//String text = line;
			String ZIPCODE ="" ;
			String SIDO	= "";
			String GUGUN = "";
			String DONG	= "";
			String BUNJI= "";
			String SEQ = "";
			
//****************원래 최대 인덱스가 9개라고 되어있는데 6개 이상만들면 오류가 계속뜨네 ..?? ****************//			
			
			line=br.readLine(); //readLine은 한줄을 읽어온다. 개행문자(줄바꿈\n를 읽지 않는다)를 읽지 않음.
			String [] str = line.split(","); // 한줄을 읽어와서 문자열을 기준으로 나눠서 배열에 담는다.
			ZIPCODE = str[0];		
			SIDO = str[1];
			GUGUN = str[2];
			DONG = str[3];
			BUNJI = str[4];
			SEQ= str[5];
			
			
			
			int num = 1;
			System.out.println("-----------------------------------------------");
			System.out.println("|                  보기 참조                     |");
			System.out.println("| ZIPCODE , SIDO , GUGUN , DONG , BUNJI , SEQ |");
			System.out.println("|  135-806  서울	   강남구	   개포1동 경남아파트      |");
			System.out.println("|                나가기(EXIT)                   |");
			System.out.println("-----------------------------------------------");
			System.out.println("\n다음 해당하는 "+ selectNum+" 에 맞춰서 입력하시오 ");
			
			while((line=br.readLine())!=null) {  //readLine은 개행문자(줄바꿈\n)을 읽지 않는다. 1줄 1줄 다 읽어서 해당 행이 null이 아닐때까지 읽는다. 
				
				
				if(BUNJI.equals(selectNum) ) {
					Scanner in2 = new Scanner(System.in);
					search = in2.next();
					if(search!=null) {
						while((line=br.readLine())!= null){
							str = line.split(",");
							ZIPCODE = str[0];
							SIDO = str[1];
							GUGUN = str[2];
							DONG = str[3];
							BUNJI = str[4];
							SEQ = str[5];
							
							
							
							if(DONG.contains(search) || BUNJI.contains(search) || SEQ.contains(search) ) {
								
								String fmt = "%d %s %s %s %s %s %s\n";
								String msg = String.format(fmt, num,ZIPCODE,SIDO,GUGUN,DONG,BUNJI,SEQ);
								System.out.println(msg);
								bw.write(msg);
								num++;
							}
						}
					}
				}
			
			String fmt = "총 개수 %d";
			String msg = String.format(fmt, num-1);
			bw.write(msg);
			System.out.println("검색완료");
			
		//	int totalMart = 0;
			
		//	int [] Marttotal = newxe int [3];
			
			
			}
			
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
