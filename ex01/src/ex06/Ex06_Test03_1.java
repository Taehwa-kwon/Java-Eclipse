//문자 배열 -> 문자열로 변환
package ex06;

import java.io.UnsupportedEncodingException;
import java.sql.Date;  //< import java.util.date;
import java.text.DecimalFormat;

public class Ex06_Test03_1 {

	public static void main(String[] args) {
		// 문자배열 -> 문자열로 변환
		
		byte [] bytes = {'H','E','l','l','o',' ','w','o','r','l','d',};
		String str1= new String (bytes);
		System.out.println(str1);
		
		char [] bytess = str1.toCharArray();
		System.out.println(bytess);
		
		
		String str2 = new String(bytes,6,4); // 6: 시작위치, 4:갯수
		System.out.println(str2);
		
		//
		String str3 = "안녕하세요";//한 자에 3바이트 
		
		byte [] bytes3 = str3.getBytes();
		System.out.println(bytes3.length);
		
		for (int i = 0;  i<bytes3.length; i++) {
			System.out.printf("%d" , bytes3[1]);
		}
		
		//네트워크 통신 프로그램에 사용한다
		//-----------------------------------------------
		
		//encoding 변환 EUC-KR로 바꾸는 소스
		
		try {
			byte[] bytesEUCKR = str3.getBytes("EUC-KR");
			System.out.println(bytesEUCKR.length);
			
			String strEUCKR = new String(bytesEUCKR, "EUC-KR");
			System.out.println(strEUCKR);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		//---------------------------
		//대소문자 변환 
		String sc1 = " Text Editor v1.8";
		System.out.println(sc1.toUpperCase()); // 모두 대문자로
		System.out.println(sc1.toLowerCase()); // 모두 소문자로
		System.out.println(sc1.trim()); // 앞뒤 공백 제거
		
		//문자열 일부 추출
		String sc2 = "901225-1111114";
		
		System.out.println("태어난 연도 : " + sc2.substring(0,2));
		System.out.println("태어난 월 : " + sc2.substring(2,4));
		System.out.println("태어난 일 : " + sc2.substring(4,6));
		System.out.println("태어난 성별 : " + sc2.substring(7,8));
		
		
		
		String year = sc2.substring(0,2);
		String month = sc2.substring(2,4);
		String day = sc2.substring(4,6);
		String sex = sc2.substring(7,8);
		
		
		if (sex.equals ("1") ||sex.equals("3")||sex.equals("5")||sex.equals("7")||sex.equals("9"))
		sex = "남자";
		else
			sex ="여자";
		String bYear = (sex=="2"||sex=="4")?"20" + year: "19" + year ;
		
		System.out.println(year+"年"+month+"月"+day+"日" );
		
		int y = Integer.valueOf(year);
		int m = Integer.valueOf(month);
		int d = Integer.valueOf(day);
		int yy = Integer.parseInt(year);
		
		System.out.println(yy);
		System.out.println(y);
		
		
		
		Date oneday = new Date(y,m-1,d);
		System.out.println(oneday.toLocaleString()); // 이게 년/월/일
		int wkday = oneday.getDay();
		System.out.println(wkday);
		
		String [] wk = {"日","月","火","水","木","金","土"};
		
		String format = "%4d年년 %2d月 %2d일 周%s ";   // 이것도 중요
		String msg = String.format(format, y,m,d,wk[wkday]);

		System.out.println(msg);
		
		// leading 35를 ->0035로 만들어라
	
		
		//세자리마다 ,출력
		DecimalFormat df = new DecimalFormat("###, ###.###");
		int price1 = 12345678;
		System.out.println(df.format(price1));
		double price2 = 1234567890.123456789;
		System.out.println(df.format(price2));
		
		
		
		//~로 시작하는  //궁금한게 이런게 true 면 다시 true 값을 받아서 "정답"이런 문구를 내려면 어떻게해야하지?
		String name1 = "김유신";
		System.out.println(name1.startsWith("김"));
		
		// 포함하는
		
		
		
		//로 끝나는
		String name2 = "이순신";
		System.out.println(name1.endsWith("신"));
		
		//문자열을 문자 배열로
		String string = "abcdefghijklmnopqrstuvwxyz";
		char [] charArr = string.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			System.out.println(i+ ":" + charArr[i]);
			}
		
		//문자열을 token으로 분리하여 문자배열로  굉장히 많이씀 !!
		String str = "문재인,부산,58세";
		String [] president = str.split(",");
		String name = president[0];
		String addr = president[1];
		String age = president[2];
		
		for (int i = 0; i < president.length; i++) {
			System.out.println(president[i]);
		}
		
		String format1 ="%4s %4s %4s";
		String msg1 = String.format(format1, president[0],president[1],president[2]);
		System.out.println(msg1);
		
		
		String [] s = str.split(",");
		String [] c = str.split(":");
		
		for (int i = 0; i < s.length; i++) {
			System.out.println( s[i] );
			
		}
		
		
		
	}

}
