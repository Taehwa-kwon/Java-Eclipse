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

SQL injection 
String uid = "a";
String pwd = "1' or '1'='1";    이건 무조건 비밀번호 다뚫리는것. 이게 injection 이며 statement가 가지는 문제점..

select * from member where (uid = 'a' and pwd = '1' ) or ('1'='1')

or이 입력이 안되도록 걸러줘야하는데 그걸 preparedstatement 가 막아준다. 
preparedstatement 는 인자를 물음표로 처리하는데 만약 System.out.println하면 값이 안나옴 (이게 단점임 ..) 


--05/25  오전
Statement - PreparedStatement - CallableStatement
Statement Run을 했을때 문장을 넘겨서 문장의 오류를 검사하고 select from 구문분석하고 , 컴파일하고 저장하고 , 다시 불러와서 실행하고 이러한 과정을 반복
캐시 : 동일한 문장을 반복할때 이를 미리 저장해서 더 빠르게 실행
Preparedstatement - Statement 같은 문장을 반복할때 구문분석 문법체크 컴파일 과정을 생략하여 내부적으로 속도를 훨씬 빠르게 만듬. 
                  - 또한 보안에 관해서 훨씬 더 좋다.
                  - 그렇다면 단점은 없냐??있지. 이미 캐시에 저장되어 있어서 System.out.println이 작동하지 않는다. 
                  -사용법 : 바인딩 ( ? 을 통해서 값을 넣는 것 ) 
                  
                  


--05/25 오후
참고할 사이트 : https://wiper2019.tistory.com/57?category=776243


--05/26 오전

--05/26 오후

--05/27 오전
--05/27 오후


--05/28 오전

--05/28 오후

--06/01 오전

프로세스는 실행 중인 하나의 프로그램,  하나의 프로세스느 하나의 프로그램을 실행시킨다.

멀티 프로세스 : 독립적으로 프로그램들을 실행학 여러 가지 작업 처리 

멀티 스레드(실타레) :  한 개의 프로그램을 실행하고 내부적을 여러 가 작업 처리

멀티 테스킹 : 윈도우가 하나하나 프로그램한테 시간을 할당 


메인스레드 : 모든 자바 프로그램은 메이 스레득 메인 메소드 실행하며 시작



