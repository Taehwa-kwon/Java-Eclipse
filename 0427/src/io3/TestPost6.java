package io3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class TestPost6 {
	
	public static void main(String[] args)    {
		
		File file1 = new File("C:/tmp/zipcode33.txt");

		FileReader fr = null;
		BufferedReader br = null;
		
		//fr = new FileReader(file1); //1.써라운드
		//br = new BufferedReader(fr);
		
		try {
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			System.out.println("작업종료");
			
			String line = ""; //3.이건 읽은줄을 담기위해서 .
			br.readLine();// 2. title 줄은 읽어서 버린다. 이건 버릴꺼니깐 따로 담지않고 그냥 읽는걸로 마무리. enter은 안읽겠다.  첫줄 읽어쓴ㄴ데 담는데 없지.
			
			//br.skip(바이트 수) // byte 수 만큼 recordPoint를 skip한다. 즉 띄운다.
			
			TreeSet<String> TreeSet = new TreeSet<String>(); //6.
			while( (line=br.readLine())!=null ) { 
				
				//5.
				String [] addr = line.trim().split(",");
				String sido = addr[1].trim();	
			
				TreeSet.add(sido);
			}
			
			for (String sido : TreeSet) {
				System.out.println(sido);
			}
			System.out.println(TreeSet.size());
			
			
		} catch (IOException e) {
			System.out.println("오류발생" + e.getMessage());
		}finally {
			try {
				if(br != null) br.close();
				if(fr != null) fr.close();
			}catch(IOException e ) {
				
			}
		}
	}
}

		
		