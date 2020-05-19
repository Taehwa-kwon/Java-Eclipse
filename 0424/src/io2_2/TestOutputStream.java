package io2_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutputStream {
//
	public static void main(String[] args) throws IOException {
		String filename = "c:/tmp/abc8.txt";
		File file = new File(filename);
		FileOutputStream fos = new FileOutputStream(file);
		
		for (int i = 'A'; i < 'Z'; i++) {
			fos.write(i);  //근데 문자로 바로 입력해도 인트타입으로 반환하네?
			
			// int.. (-1 의 뜻은 ctrl+z 파일의 맨마지막이다 )  read() 함수는 파일끝을 -1로 여긴다.(EOF end of file) 
		}
		fos.close();
		
		

	}

}
