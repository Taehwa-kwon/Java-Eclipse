package io2_2; // append 기능

//db는 엄청많은 데이터를 쌓아놓고 몇몇 데이터,조건으로  뽑아서 간편하게 하려고 , 
//근데 처음부터 모든것을 다 사용해야 된다면 db안쓰는것도 괜찮다.

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter3 {

	public static void main(String[] args) throws IOException {
		//신규 생성
		File	file	=	new	File("c:/tmp/out5.txt");
		FileWriter	fw	=	new	FileWriter(file,true); // append 의 개념 설명 //이게 숙제랑 연관되는게 중요하네 .. 왜냐하면 자료들이 계속 쌓이면서
		fw.close();
		
		//append			true								false
		//파일			기존자료(有)/기존자료(没有)					기존자료(有)/기존자료(没有)
		//읽기			뒤에추가/new파일 (뒤에추가)				  	  덮어쓰기/new파일(새로생성)
		//쓰기
		
		//추가가능모드로 열기
		fw = new FileWriter(file,true);
		
		fw.write("점심에는 칼국수"+"\n");//이렇게 저장하고  다시 이걸지우고
		
		fw.write("저녁에는 수제비\n");//이걸 저장해서 실행하면 
		
		//1.맨처음에는 점심에는 칼국수가 적히고 맨 뒷글자에 file pointer이 있는데 다시 fw.write("저녁에는 수제비") 이것만 단독으로 실행하면 다시 file pointer이 맨앞으로 와서 지워진다. 
		//file pointer의 기능중에 open 하면 맨 앞으로 *이 돌아온다.
		//*------------------------------------------------------------------------
		//점심에는 칼국수 
		//
		//---------------------------------------------------------------------------
		
		//해결법이 append를 해준다.
		fw.close();
	}

}
//1단계.
	//cmd 
//2단계
	//copy con aa.txt 			//con콘솔 내가 지금치는것
	//안녕하세요
	//Hello
	//^z (ctrl+z)
//3단계
	//dir 
//4단계
	//type aa.txt
