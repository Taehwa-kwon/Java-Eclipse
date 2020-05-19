//주민등록번호 확인 검사기
package ex04;

public class Ex04_Test08_1 {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 - 7 8 9 0 1 2 3  
		//int 형은 10자리 밖에 표현을 못해서 안됌(int로 이용하려면 앞자리 뒷자리 나눠서 계산 + 한자리 한자리 계산해야 해서 복잡하다.
		//- 그래서 한번에 계산을 위해서 배열을 이용한다. 
		
		// = int [] nid =new int[] { 1,2,3,4,5,6,7,8,9,0, 1,2,3 };// 1차원 배열 선언방법
		
		int [] nid = { 1,2,3,4,5,6,7,8,9,0,1,2,3 };//nid 는 변수명 , 이게 내 주민번호라고 가정 
		int [] m = {   2,3,4,5,6,7,8,9,2,3,4,5};  // 주민번호 시작번호 
		
		int sum = 0;
		for (int i = 0; i <nid.length-1; i++) {  // 주민번호에서 -1  (체크digit 를 뺸다)
			sum = sum+nid[i] * m[i]; 
			
		}
		// System.out.println(sum); 여기 계산하면 272임
		
		int chk = 11- sum % 11; // int chk = 272 % 11; chk= 11 - chk; 이걸 한문장으로 적은거
		if(chk>10)
			chk = chk - 10; //	이렇게 해야 1자리로 표현가능하니깐 11 이면 끝자리 1  12면 끝자리 2 이렇게
		
		//혹은 if (chk>10) chk=chk-10; 을 -> chk=chk%10으로 바꿔도 됌 . 왜냐하면 간단하니깐 
		
		System.out.println(sum+ "," + chk);
		if(chk == nid[12]) {
			System.out.println("정확한 번호 입니다");
		} else {
			System.out.println("틀린 번호 입니다");
		}
		
		

		/*		
		sum =sum + nid[0] * m[0]; //nid 0번째와 m 의 0 번쨰를 서로 곱한다 . 총 13자리인데 0부터 시작하니깐 11자리까지 곱하면 됌 12번째 자리는 check digit니깐
		sum =sum + nid[1] * m[1];
		sum =sum + nid[2] * m[2];
		sum =sum + nid[3] * m[3];
		sum =sum + nid[4] * m[4];
		sum =sum + nid[5] * m[5];
		sum =sum + nid[6] * m[6];
		sum =sum + nid[7] * m[7];
		sum =sum + nid[8] * m[8];
		sum =sum + nid[9] * m[9];
		sum =sum + nid[10]* m[10];
		sum =sum + nid[11] * m[11];
*/
	}
}

/* 
 * 11행까지 잘라서 다 담아두고 13행에서 정해진 넘버랑 곱하기 시키고  check digit 를 뺸나머지를 곱해서 sum에 합친다. 그럼 272가 나옴 .
 * 그럼 11을 빼고 (11을 빼는 이유는 약속이래) 그게 10보다 크면  -10을 해서 뒷자리만 남겨둔다 . 
 * 앞자리를 때려고 할떄는 n/10 뒷자리를 때려고 하면 n%10 
 */
