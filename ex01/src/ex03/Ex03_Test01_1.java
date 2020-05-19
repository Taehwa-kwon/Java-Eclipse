package ex03;

public class Ex03_Test01_1 {

	public static void main(String[] args) {
		// 비트 연산!

		//bit masking 특정 비트를 추출
		
		// ~ : bit not 
		// & : bit and
		// | : bit or 
		// ^ : bit xor 
		// << : bit shift : 들어오는 값이 0  
		// >>: bit shift : 들어오는 값이 부호비트의 값
		// >>>: bit shift : 들어오는 값이 0
		
		// 0 1 0 1 1 0 1 1 : 원본
		// 0 0 0 1 1 0 0 0 : 추출대상 4, 5번째 값
		// 0 0 0 0 0 0 0 0 : 결과 = 0
		// 0 0 0 0 1 0 0 0 : 결과 = 8
		// 0 0 0 1 0 0 0 0 : 결과 = 16
		// 0 0 0 1 1 0 0 0 : 결과 = 24
		
		int a = 91;
		int mask = 24;
		int result = a &mask;
		String msg = "";
		switch(result) {
		case 0  :msg="black, ssd X"; 	break;
		case 8  :msg="black, ssd O";	break;
		case 16 :msg="color, ssd X";	break;
		case 24 :msg="color, ssd O";	break;
		}
		System.out.println(msg);
		
		result = result >> 3; 
		result = 164;
		result &= 24;
		result >>= 3;
		// 0 0 0 1 1 0 0 0 를 오른쪽으로 3칸으로 이동 0 0 0 0 0 1 1 1
	
		// 0 0 0 0 0 0 0 0 : 결과 = 0
		// 0 0 0 0 0 0 0 1  : 결과 1 
		// 0 0 0 0 0 0 1 0 : 결과 2
		// 0 0 0 0 0 0 1 1  : 결과 3
		
		int c = 3;
		int d = ~c;
		System.out.println(d);
		
	}

}



