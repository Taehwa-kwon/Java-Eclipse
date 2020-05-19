package io3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestPost5 {
	
	public static void main(String[] args)    {
		
	/* 각 시도별 데이터를 별도의 파일로 출력 - 세종 포함 총 17개 시도
	 * zipcode.csv
	 * 서울.csv , 부산 csv, 대구.csv
	 * 
	 */
		String 			path = ("C:/tmp/zipcode33.txt");
		File 			file = new File(path);
		
		FileReader 		fr = null;
		BufferedReader 	br = null;
		FileWriter 		fw = null;
		BufferedWriter 	bw = null;
		
		//1. surround fr = new FileReader(file);
		
		try {
			fr 	= new FileReader(file);
			br	= new BufferedReader(fr);
			
			String prevSido = "";
			String line =",";
			//3. add catch clause이거 선택하기  br.readLine();//첫줄날리기
			br.readLine();//첫줄날리기
			
			int cnt = 0;
			
			while((line = br.readLine())!=null) {
				
				String sido =line.trim().split(",")[1]; //4.첫번쨰 줄을 짜른다...
				if(!sido.equals(prevSido)) {//5.같지않다면
					//6.맨위 컬럼명 날렸고, 두번째 서울 .csv 를 만든다.
					//7.line을 저장한다.
					String oPath="c:/tmp/"+sido+".csv";
					fw = new FileWriter(oPath); //8.append 뒷자리 append니깐 계속 추가수정할수 있는지 여부를 묻는말
					//bw = new BufferedWriter(fw); 전부다 버퍼 필요없을것 같다. 이유는 한줄 받아서 한줄 적는거니깐 뭐 별거없음
					
					//bw.write(line);
					//bw.close();
					fw.close();
					prevSido = sido;
				
				} 
					String oPath="c:/tmp/"+prevSido+".csv";
					fw = new FileWriter(oPath,true); //8.append 뒷자리 append니깐 계속 추가수정할수 있는지 여부를 묻는말
					bw = new BufferedWriter(fw);
					bw.write(line+"\n");
					bw.flush();// 9. flush 버퍼에 남아있는것을 비운다..
					System.out.println(cnt + ","+line);
					
					cnt++;
					bw.close();
					fw.close();
					
				
			}
			System.out.println("완료");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//2. surround fr.close();
			try {
				if (br != null) br.close();
				if (fr != null) fr.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

		
		