package ex08;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		Student [] studs = new Student[5]; // 클래스가 들어갈 배열은 먼저 확보 .
		
		studs[0] = new Student(1, "쯔위", 100,90,80);  //Int형과 String형은 일반 숫자와, 따옴표로 딱 정의되어있다.
		studs[1] = new Student(2, "모모", 90);		// 근데 여기는 student 배열안에 해당 타입으로만 넣어줘야 하니깐 new 를 해준다. 
		studs[2] = new Student(3, "사나", 80);
		studs[3] = new Student(4, "소미", 67);
		studs[4] = new Student(5, "정연", 50);
		System.out.println(Arrays.toString(studs));
		
		System.out.println(studs[0]);
		System.out.println(studs[1]);
		
//		int [] array_List = new array_List[];
//		
//		array_List[0]= 1;
//		
//		String [] array_String_List = new array_String_List[];
//		array_String_List[0]="헷갈린다";
		
		//----------------------------------//
		
//-------------------------------------------------------------------------
		//한방에 출력하는 Students 클래스 !
		

		Students st = new Students (studs);
		st.output(studs); 
		
		
		
	}
	

}
