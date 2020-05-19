//주민등록번호 확인 검사기
package ex04;

public class Ex04_Test08_2 {

	public static void main (String[] args) {
		//------------------------기본상식----------------------------------------//
//				앞자리 940118 : 6자리   뒷자리 1124120 : 7자리    맨뒷자리 check Number 	
//				앞자리 234567 		      뒷자리892345 를 자신의 주민번호와 자리대로 곱하고 나누기 11 , -11을 하면 된다.
		//------------------------주민 등록 번호  ----------------------------------------//		
				int [] My_Number = { 9,4,0,1,1,8,1,1,2,4,1,2,0};
				int [] Check_Number =  { 2,3,4,5,6,7,8,9,2,3,4,5};

		//------------------------2차원 배열 for을 통한 값 찍어내기 ----------------------------------------//		
				int sum=0;
				for (int i = 0; i < My_Number.length-1; i++) {
					sum=sum + My_Number[i] * Check_Number[i];
				}
				System.out.println(sum);
				
				int chk=0;
				chk = 11-sum%11;
				System.out.println(chk);
				
				if (chk>10)
					chk= chk-10;
				else chk=chk;
					
					System.out.println(sum+" "+ chk);
					if (chk==My_Number[12]) {
						System.out.println("인증완료");
					}	else {
						System.out.println("인증불가");
					}
				
			}	
		}
