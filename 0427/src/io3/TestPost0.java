package io3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class TestPost0 {
	//학교컴퓨터는 C가 SSD 고 D 가 하드디스크래 
	
	static int cnt = 0;
	
	public static void main(String[] args) {

		String		path = "/Users/gray/Desktop/java/zipcode_20130201(org).txt";
		File		file = new File(path);
		
		if( !file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			//return ; // 이 방법을 통해서 파일이 없으면 함수 종료가 가능하다.
			System.exit(0); // 시스템 강제 종료	
/*
Unreachable code 절떄 실행안되는 코드라는 오류문			
*/		
			
		}
		FileReader	fr	 = null;		//여기서 첫번째 Excetion; 
		BufferedReader br	= null;
		
		try {
			fr	= new FileReader(file);		
			br	= new BufferedReader(fr);
			
			String line= "";
			while((line = br.readLine()) !=null ) { //Q1. 여기서도 Excetion이 뜬다. add catch clause Excetion을 실행.
				
				address_work (line); //주소에 대한 한줄에 대해서
				
			}
			
			System.out.println(TestPost0.cnt + "건 검색되었습니다.");
			
			System.out.println("저장완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");	//Q2. if 문안에도 파일이 없습니다. 이 문구가 있는데 여기도 Exception 이 있는 이유는 위에서 파일을 다 읽고나서 usb를 뺴거나 등등의 파일을 없애는 행동이 있을수 있어서.
		} catch (IOException e) {				//A1. 일반 추가
			System.out.println( "입출력 오류 " + e.getMessage());
		} catch (Exception e) {					//A1. 일반 추가
			System.out.println("일반오류" + e.getMessage());
		}finally {
			} try {
				if (br!= null)  br.close();
				if (fr!= null) fr.close();
			}catch (IOException e1) {
			}
		}

	private static void address_work(String line) throws UnsupportedEncodingException {
			
		//byte [] encodedName = line.getBytes("utf-8");
		
		String [] addr = line.trim().split(",");
		
		 // ctrl shift y , ctrl shift x
		
		String zipcode = addr[0].trim();
		String sido=addr[1].trim();
		String gugun=addr[2].trim();
		String dong=addr[3].trim();
		String bunji=addr[4].trim();
		String seq=addr[5].trim();
		
		String fmt = "%s %s %s %s %s %s";
		String msg = "";
		if( dong.contains("롯데백화점")) {
			msg = String.format(fmt, zipcode,sido,gugun,dong,bunji,seq);
			System.out.println(msg);
			cnt++;
		}
		
		}
	

	}

