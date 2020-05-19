package io2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Student{ //계속 Student에서 값을 가지고 있어야하나 아니면 그때그떄 사용하는거냐. ex) tot,avg
	int num;
	String name;
	int kor;
	int eng;
	int mat;
	//int tot;//1가지방법
	//int avg;//1가지방법
	
	public Student() {};
	
	public Student(int num, String name, int kor, int eng, int mat) {
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		//getTot();
		//getAvg();
		
		//this.tot = kor+eng+mat; //1가지 방법
	}
	public int getTot() { //2방법
		return this.kor +this.eng+this.mat;
	}
	public int getAvg() {
		return getTot()/3;
	}

	@Override
	public String toString() {
		String fmt = "%d %s %d %d %d %d %d";
		String msg = String.format(fmt, this.num,this.name,this.kor,this.eng,this.mat,getTot(),getAvg());
		return msg;
	}
}

public class TestFileWriter {

	public static void main(String[] args) throws IOException {		//throws IOException 을 통해서 안에 정상실행이 안되면 튕겨져 나온다. 이게 간편하고 throws 안쓴다면 0424 io2_2 참조
		File file = new File("c:/tmp/out3.txt"); // 역슬래쉬 2개 or / 이거 하나 // "" 뒤에 true 는 append (기존의 자료에 추가할것인가? ) 
		Student std = new Student();					
		
	
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		// 키보드 입력부 
		Scanner in = new Scanner(System.in);
		System.out.println("입력: 번호 이름 국어 영어 수학		, 종료(exit)");
		bw.write("번호 이름 국어 영어 수학 총점 평균 \n");
		
		//반복영역시작~
		while(true) {		//for 문은 정해진 순서를 샌다...그 데이터양을 미리 알수가 없다.
		String inputLine = in.nextLine();
		
		//if (inputLine.compareToIgnoreCase("exit")==0) break; // 무한루프 탈출조건 //compareTo는 숫자를 리턴함..
		if(inputLine.equalsIgnoreCase("exit")==true) break;	//if문은 true false를 생략할수 있다. (==true) 이 부분
		
		String [] str = inputLine.split(",");
		int num = Integer.valueOf(str[0].trim());
		String name = str[1].trim();
		int kor = Integer.valueOf(str[2].trim());
		int eng = Integer.valueOf(str[3].trim());
		int mat = Integer.valueOf(str[4].trim());
		//System.out.println(inputLine);
		Student s1 = new Student(num,name,kor,eng,mat);	// 객체가 1개인데 여러번 반복해도 된다..
														// s1은 한번 사용되고 저장되고 반복문 밖으로 나가서 다시 반복xN 번  
		
		//출력
		//bw.write("번호 이름 국어 영어 수학\n");
		
		String msg = s1.toString();
		bw.write(msg+"\n");
		}
		//반복 끝
		
		
		bw.close();
		fw.close();
		
		System.out.println(file.getName()+"이 정상 작성되었습니다.");
		

	}

}
