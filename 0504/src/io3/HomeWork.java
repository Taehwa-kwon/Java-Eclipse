package io3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork {
	
	static ArrayList<String> sidoList = new ArrayList<String>();
	static ArrayList<String> gugunList = new ArrayList<String>();
	
	static String ZIPCODE = "" ;		
	static String SIDO	= "";
	static String GUGUN = "";
	static String DONG	= "";
	static String BUNJI= "";
	static String SEQ = "";
	static String gugun_search = "";  	// xx구 검색
	static String dong_search = "";  	// xx동 검색
	static String bunji_search = "";  	// 번지 검색
	
	public static void main(String[] args)    {
		
		File file1 = new File("/Users/gray/Desktop/java/zipcode.csv");
		File file2 = new File("/Users/gray/Desktop/java/zipcode_result.csv");
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			fr = new FileReader(file1);
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "euc-kr"));	//utf-8로 바로 변환하는 함수
			fw = new FileWriter(file2,true);
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), "euc-kr"));
			

			
			//여기서 먼저 1.전체목록을 확인하시겠습니까?  2. Exit 이있어야 한다. 
			System.out.println("----------------------------------------------");
			System.out.println("|       다음 중 원하시는 목록을 선택하시오            |");
			System.out.println("|    1.대한민국 전체 시도 확인   2.나가기(EXIT)      |");
			System.out.println("----------------------------------------------");
			
 			Scanner in = new Scanner(System.in);
 			String FirstCheck = in.nextLine();
			
			String line = ""; //3.이건 읽은줄을 담기위해서 .
			br.readLine();// 2. title 줄은 읽어서 버린다. 이건 버릴꺼니깐 따로 담지않고 그냥 읽는걸로 마무리. enter은 안읽겠다.  첫줄 읽어쓴ㄴ데 담는데 없지.
			
			line = br.readLine();
			String [] str = line.trim().split(",");
			ZIPCODE = str[0];		
			SIDO = str[1];
			GUGUN = str[2];
			DONG = str[3];
			BUNJI = str[4];
			SEQ= str[5];

			/*							전체시도									*/
				if(FirstCheck.equals("1")) {
					int Count = 0;
						while ((line=br.readLine())!=null) {
							str = line.trim().split(",");
							ZIPCODE = str[0];		
							SIDO = str[1];
							GUGUN = str[2];
							DONG = str[3];
							BUNJI = str[4];
							SEQ= str[5];
							if(!sidoList.contains(SIDO)) {
								sidoList.add(SIDO);
								Count++;
								String fmt = "%d %s ";
								String msg = String.format(fmt, Count,SIDO);
								System.out.print(msg);
								
								bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), "euc-kr"));
								bw.write(msg);
								}
							else if(FirstCheck.equalsIgnoreCase("exit")==true)break;
					}
				}

				/*							지역 목록									*/			
				br.close();
				fr.close();
		
				fr=new FileReader(file1);		
				br = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "euc-kr"));
				br.readLine();
				
				System.out.println();
				System.out.println("----------------------------------------------");
				System.out.println("|       다음 중 원하시는 목록을 선택하시오            |");
				System.out.println("| 1.서울 2.부산 3.대구 4.인천 5.광주 6.대전 7.울산 8.세종|");
				System.out.println("| 9.강원 10.경기 11.경남 12.경북 13.전남 14.전북 15.제주| ");
				System.out.println("| 16.충남 17.충북 |");
				System.out.println("|                나가기(EXIT)                  |");
				System.out.println("----------------------------------------------");
				
				String SecondCheck = in.nextLine();
			
				if(SecondCheck.equals("1")) {
				int Count = 0;
				
				
				System.out.println();
				System.out.println("----------------------------------------------");
				System.out.println("-------------해당 지역의 구이름과 개수-------------");
				System.out.println("----------------------------------------------");
				while ((line=br.readLine())!=null) {
					str = line.trim().split(",");
					SIDO = str[1];
					GUGUN = str[2];
					

						if(SIDO.equals("서울")) {
							if(!gugunList.contains(GUGUN)) {
							gugunList.add(GUGUN); 
						
						Count++;
						
						
						String fmt = "%d %s %s";
						String msg = String.format( fmt,Count,SIDO,GUGUN );
						System.out.println(msg);
						bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), "euc-kr"));
						bw.write(msg);
							}
						}
					}
				}
				br.close();
				fr.close();
		
				fr=new FileReader(file1);		
				br = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "euc-kr"));
				br.readLine();
				
				
				/*							부산 남구 동명 								*/
		
				System.out.println();
				System.out.println("----------------------------------------------");
				System.out.println("|                부산의 남구 동명 출력             |");
				System.out.println("|                나가기(EXIT)                  |");
				System.out.println("----------------------------------------------");
				
				
			String thirdCheck = in.nextLine();
			if(thirdCheck.equals("1")) {
				int Count = 0;
				while ((line=br.readLine())!=null) {
					
					str = line.trim().split(",");
					SIDO = str[1];
					GUGUN = str[2];
					DONG = str[3];
					

						if(SIDO.equals("부산")&&GUGUN.equals("남구")) {
						
						Count++;
						String fmt = "%d %s %s %s";
						String msg = String.format(fmt,Count,SIDO,GUGUN,DONG );
						System.out.println(msg);
						bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), "euc-kr"));
						bw.write(msg);
						}
					}
				}
			br.close();
			fr.close();
	
			fr=new FileReader(file1);		
			br = new BufferedReader(new InputStreamReader(new FileInputStream(file1), "euc-kr"));
			br.readLine();	
					/*								구의 이름과 동입력 								*/
			
			
			System.out.println();
			System.out.println("----------------------------------------------");
			System.out.println("|               구의 이름과 동이름 입력            |");
			System.out.println("|               예) 종로구,인사동            |");
			System.out.println("|                나가기(EXIT)                  |");
			System.out.println("----------------------------------------------");
			
		
				String fourthCheck = in.nextLine();
				String [] token = fourthCheck.split(",");
				gugun_search = token[0];
				dong_search = token[1];
				int Count = 0;
				
					while ((line=br.readLine())!=null) {
						str = line.trim().split(",");
						SIDO = str[1];
						GUGUN = str[2];
						DONG = str[3];
						BUNJI = str[4];
						SEQ = str[5];
				if (GUGUN.equals(gugun_search) && DONG.contains(dong_search)) {
							Count++;
							String fmt = "%d %s %s %s";
							String msg = String.format(fmt,Count,SIDO,GUGUN,DONG,BUNJI,SEQ );
							System.out.println(msg);
							bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2), "euc-kr"));
							bw.write(msg);
						}
					}
			
			
			
			} catch (IOException e) {
			System.out.println("오류발생" + e.getMessage());
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
				if(bw != null) bw.close();
				if(fw != null) fw.close();
				
			}catch(IOException e ) {
				e.getMessage();
			}
		}

	}}

		
		