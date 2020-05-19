package io3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestPost1 {
	//학교컴퓨터는 C가 SSD 고 D 가 하드디스크래 
	public static void main(String[] args) throws IOException {
		String		path = "/Users/gray/Desktop/java/zipcode_20130201(org).txt";
		File		file = new File(path);
	
		
		FileReader	fr	 = new FileReader(file);		//여기서 첫번째 Excetion;
		
		
		try {
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} fr.close();// 여기서 두번째 Excetion //  IOException 

	}

}
