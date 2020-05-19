package io2_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) throws IOException { //IOE로 해준다.
		String filename = "/Users/gray/Desktop/java/zipcode_20130201(org).txt";
		
		FileReader fr = new FileReader(filename);		//1. FileReader는 2가지 체크를 해야한다. IOException이 부모 , filenotFoundException이 자식이라서 
		BufferedReader br = new BufferedReader(fr);
		
		String name1= br.readLine();		//이거 한번에 한줄만 출력받네..
		System.out.println("한줄 출력=== " + name1);
		
		String line = null;		//line 은 글자 + 맨끝 enter 까지 읽는거임.
		int n = 1;
		while((line =br.readLine()) != null ) {	//파일끝까지 한줄씩 한줄씩 계속 읽고 line에 담기게 되고 맨 끝이 null이 되면 
		String name = line;		//한 줄을 읽고 name 을 담고 
		System.out.println(n+","+name);	//그래서 메모장에 있는 한 줄을 읽어서 한줄씩 출력한다.
		n++;
		}
		
		
		br.close();
		fr.close();		//2. close 는 IOException이니깐 

		}
	}

