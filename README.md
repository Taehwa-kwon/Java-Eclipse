# Java-Eclipse

--05/24   오전

라이브러리 : 같은 함수들 모아둔것이 라이브러리 ,

                               응용(view)
java                          CONSOLE, SWING
JSP(HTML+CSS+JS+JQUERY)       WEB(BROWSER)
SPRING                        응용프로그램 +WEB



          DATA ->가공 -> VIEW
    ORACLE,FILE->가공->화면
JDBC (JAVA DATABASE CONNECTIVETY LIBRAY


1)Class.forName()   //자바에서 api(라이브러리,남들이 만든 DLL, 남들이 만든 클래스, API) 를 불러올때 사용하는 것/OJDBC에 연결하겠다. 
  DriverManager.getConnection //상단의 url,dbuid,dbpwd을 통해서 연결 
  
  인터넷 환경에서 다른 컴퓨터를 연결하기 위해서 IP(인터넷 상 의 주소)를 사용 (전화번호도 하나의 ip인데 컴퓨터는 port라는 기능을 통해서 
  마우스,키보드,usb등등 통신하고 있다.)(통신의 일종인데 통신포트는 0번부터 65535(64k개)개
  well known : 알려진 포트가 0~1023개의 포트 (하드웨어가 사용하는 것 이라서 사용하면 안된다.) 1024 ~ 47000는 프로그램에서 사용가능 
  
jar 파일 : 압축파일이다...아 압축을 풀어서보면 java,sql,util,swing 각종 폴더안에 data.class , array.class등등 엄청나게 많이있음
import하는 이유는 java.sql.   Statement,Connection,ResultSet등등의 클래스가 있음 


--05/24  오후
mybatis 
preparedstatement
statement 

