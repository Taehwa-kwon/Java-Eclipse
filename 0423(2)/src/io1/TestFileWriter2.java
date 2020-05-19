package io1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriter2 {

	//기존파일이 있으면 덮어쓴다! 
	
	public static void main(String[] args) throws IOException {
		String filename = "/Users/gray/Desktop/java/doczipcode_20130201(1).txt";	//파일의 위치 저장하고
		File oFile = new File(filename);		//여기에 파일을 아웃시킨다. 뒤에 인자는 String타입만 받을수 있다.
		
		FileWriter fw = new FileWriter(oFile); 		//파일생성
		BufferedWriter bw = new BufferedWriter(fw);	//한 줄씩 입출력할 경우 디스크 들어갔다가 나갔다가 오래걸림 . 텍스트를 쭉 쌓아놓고 한번에 넣으면 속도가 매우 빠름
		//fw,bw 는 한 세트라고 생각하기 .
		
		
		int	num	;
		String	name	;
		int kor;
		int eng	;
		int mat	;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t");
		String inputString = in.nextLine(); //한줄로 입력하게 하기		//nextLine을 F2눌러보면 String타입만 저장됌 
		System.out.println(inputString);		//그래서 입력한 내용을 출력하고.
		
		String [] str = inputString.split(","); //1줄짜리 배열이니깐 , ","을 기준으로 배열 [ ] str 에 담는다. 
		num = Integer.valueOf(str[0].trim());  //숫자를 문자로 변경하는 함수 (Integer.valueOf) 배열 [0]번째 자리에 있는  
		name = str[1];
		kor = Integer.valueOf(str[2].trim());
		eng = Integer.valueOf(str[3].trim());
		mat = Integer.valueOf(str[4].trim());
		
		//앞뒤 공백제거도 필수 trim() 
		
		int tot = kor+eng+mat;
		int avg = (kor+eng+mat)/3;
		
		
		bw.write("번호 이름 국어 영어 수학 총점 평균\n");
		String fmt = "%d %s %d %d %d %d %d"; //%d 는 숫자 %s 는 문자 
		String msg = String.format(fmt, num,name,kor,eng,mat,tot,avg);
		
		bw.write(msg);
		//1.아이유
		//2.
		//3.
		//4.
		//5.
		
		
		bw.close();
		fw.close();
		
		System.out.println(oFile.getName()+" 이 작성 되었습니다");
		

	}

}
