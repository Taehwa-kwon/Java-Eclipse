package A_timeEx01;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TestMain {

   public static void main(String[] args) {
      Date today = new Date();
      // 현재 컴퓨터의 날짜와 시간을 가져온다.
      // new Date()는 java.util.Date 만 가능(생성자)
      System.out.println(today);
      System.out.println(today.toString());
      System.out.println(today.toLocaleString());
      System.out.println(today.toGMTString());

      System.out.printf("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초 %d ", today.getYear(), today.getMonth()+1, today.getDate(),
            today.getHours(), today.getMinutes(), today.getSeconds(), today.getDay());
      
      System.out.println();
      
      // 2.simpleDateFormat : java 1.6
      System.out.println("2. ----------------------------");
      Date today2 = new Date();
      SimpleDateFormat dateFmt = new SimpleDateFormat("yyyy/MM/dd");
      SimpleDateFormat timeFmt = new SimpleDateFormat("hh:mm:ss a");

      System.out.println("날짜: " + dateFmt.format(today2));
      System.out.println("날짜: " + timeFmt.format(today2));
      
      // 3.
      System.out.println("3. ----------------------------");
      long time = System.currentTimeMillis();
      SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      String str = dayTime.format(new Date(time));
      System.out.println(str);
      
      
      // 4.1
      System.out.println("4.1 ----------------------------");
      Calendar cal = Calendar.getInstance();
      System.out.println("year : " + cal.get(Calendar.YEAR));
      System.out.println("month : " + (cal.get(Calendar.MONTH)+1));
      System.out.println("day : " + cal.get(Calendar.DAY_OF_MONTH));
      System.out.println("hours : " + cal.get(Calendar.HOUR_OF_DAY));
      

      // 4.2
      System.out.println("4.2 ----------------------------");
      File f = new File("D:\\ws\\temp\\zipcode.csv");
      Date fileDate = new Date(f.lastModified());
      Calendar cal2 = Calendar.getInstance();
      cal2.setTime(fileDate);
      System.out.println("year : " + cal2.get(Calendar.YEAR));
      System.out.println("month : " + (cal2.get(Calendar.MONTH)+1));
      System.out.println("day : " + cal2.get(Calendar.DAY_OF_MONTH));
      System.out.println("hours : " + cal2.get(Calendar.HOUR_OF_DAY));
      
      
      // 5. 
      System.out.println("5. ----------------------------");
      GregorianCalendar today3 = new GregorianCalendar();
      int year = today3.get(today3.YEAR);
      int month = today3.get(today3.MONTH) + 1;
      int day = today3.get(today3.DAY_OF_MONTH);
      
      GregorianCalendar gc = new GregorianCalendar();
      System.out.println(gc.get(Calendar.YEAR));
      System.out.println(gc.get(Calendar.MONTH) + 1);
      System.out.println(gc.get(Calendar.DAY_OF_MONTH));
      
      
      
      // 6.
      System.out.println("6. ----------------------------");
      TimeZone jst = TimeZone.getTimeZone("JST");
      Calendar cal3 = Calendar.getInstance(jst);
      System.out.println(cal3.get(Calendar.YEAR) + "년");
      
      // 7. 현재 날짜에서 두달전 날짜 구하기
      System.out.println("7. ----------------------------");
      Calendar cal4 = Calendar.getInstance();
      cal4.add(cal4.MONTH, -2);
      System.out.println(cal4.get(cal4.YEAR));
      System.out.println(cal4.get(cal4.MONTH) + 1);
      System.out.println(cal4.get(cal4.DATE));
      
      // 8. 특정일부터 n일만큼 더한 날짜 구하기
      //특정일의 숫자를 long형으로 읽어온 다음 long형숫자 + n*24*60*60*1000 -> 날짜형으로
      System.out.println("8. ----------------------------");
      Date today4 = new Date();
      Date tomorrow = new Date(today4.getTime() + (long)(24*60*60*1000));
      System.out.println(tomorrow.toLocaleString());
      
   }

}