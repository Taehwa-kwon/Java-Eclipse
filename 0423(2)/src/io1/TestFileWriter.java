package io1;

import java.io.BufferedWriter;
// IO 패키지 ... 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

public class TestFileWriter {

	public static void main(String[] args) throws IOException {		//예외처리 - 파일이 실행하다가 발생하는 오류
		// c: 드라이버에 tmp폴더를 만들어서 실행
		
		File outFile = new File("/Users/gray/Desktop/java/zipcode_20130201(1).txt");			// \t 는 8칸 띄우긱  \a 는 삑~소리 
		
		if(outFile.canExecute()) //파일이 존재한다면
			System.out.println("파일이 존재합니다.");
		else 
			System.out.println("파일이 없습니다");
		
		FileWriter fw1 = new FileWriter(outFile);	//파일생성
		BufferedWriter bw1 = new BufferedWriter(fw1); //
		
		String msg = "";
		String [] names = {"10","20","30","40","50"};
		//bw1.write(msg); 
		
		
		for (int i = 0; i < names.length; i++) {
			msg = String.format("%d %s \n",(i+1), names[i]);  // %d 번호  %s 문자열 // 번호는 배열보다 1개 많아야함
			bw1.write(msg);
		}
		
		//cmd 에서도 확인가능 C:\Users\PKNU>cd c:\tmp			cd는 Change Directory
		//c:\tmp>type abc1.txt
		
		bw1.close();
		fw1.close();//파일 닫기
		
		System.out.println(outFile.getName()+"파일이 저장되었습니다.");

	}

}
