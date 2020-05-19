package io2_2;

import java.io.FileInputStream;
import java.io.IOException;

public class TestInputStream {
	//inputStream 함수는 그림파일,영어로 되어있는것을 읽어서 가공하고 바이너리 데이터가지고 사용할떄 이걸 사용함
	
	public static void main(String[] args) throws IOException {
		String infile = "c:/tmp/abc1.txt";
		FileInputStream fis= new FileInputStream(infile);		//Stream은 byte 를 반환한다.
		
		 
		
		int ch;	//2.이걸 생성하고
		while( (ch=fis.read())!=-1) { //1.read 는 인트를 반환하니깐..3.ch를 추가해줌(-1 의 뜻은 ctrl+z 파일의 맨마지막이다 )  read() 함수는 파일끝을 -1로 여긴다.(EOF end of file) 
										//그까지 반복해서 한 문자씩 읽는다.
		//System.out.println(ch);	//5. 이렇게 출력하면 49 32 49 48 뭐 등등이 나옴 .. alt 누르고 49를 누르면 1이 나오고 메모장이랑 똑같이 나옴
		
			System.out.print((char)ch);	//6. 이렇게 출력하면 정상적으로 나옴. 
			

		
			
		}
		fis.close();

	}

}
