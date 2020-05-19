package io3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TestPost3 {
	
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
			
			//8.트리셋도 한번 해보면 더 간단하대.. 
			
			ArrayList<String> sidoList = new ArrayList<String>(); //6.
			String prevsido = "";
			int sidoCount = 0;
			while( (line=br.readLine())!=null ) { //4.모든걸 반복해라 .. 끝까지  2번째 줄부터 시작이니깐 이 전체를 line에 담는다. 그러다가 맨끝이면 null이 되기 전까지 계속 읽는다.
				
				//5.
				String [] addr = line.trim().split(",");
				String sido = addr[1].trim();	//이거 sido는 여기서만 쓰고 밖으로 나가면 아무 상관없다.
				
				if(!prevsido.equals(sido)) { // true 생략가능	 전의 sido 와 비교할 sido 가 같지않다면
					if( !sidoList.contains(sido)) { //7.sido리스트에 sido가 포함되어있지 않다면 추가해라 
					sidoList.add(sido);
					prevsido = sido;
					sidoCount++;
					}
				}
			}
			
			
			for (String sido : sidoList) {
				System.out.println(sido);
			}
			System.out.println(sidoCount);
			
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

		
		