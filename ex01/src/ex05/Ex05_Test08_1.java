package ex05;

import java.util.Arrays;

public class Ex05_Test08_1 {

	public static void main(String[] args) {
		// 원래는  new char[]이 있어야 하는데 생략한거 
		
		//======첫번째방법=======//
		char[] arr1 = new char[] {'j','a', 'v','a', '8'}; 
		System.out.printf("%c%c%c%c%c \n",arr1[0],arr1[1],arr1[2],arr1[3],arr1[4]);

		//======두번째방법=======//
		//char 배열은 예외적으로 각 요소가 구분자 없이 바로출력된다.
		//String 배열의 경우 print메소드 실행시 객체 주소값이 나옴 
		char [] arr1_2 = new char [arr1.length];
		  arr1_2[0] = arr1[0];
		  arr1_2[1] = arr1[1]; 
		  arr1_2[2] = arr1[2]; 
		  arr1_2[3] = arr1[3];
		  arr1_2[4] = arr1[4];
		  System.out.println(arr1_2);
		  
//		  String [] arr1_2 = new String [arr1.length];
//		  arr1_2[0] =String.valueOf( arr1[0]);
//		  arr1_2[1] = String.valueOf( arr1[1]);
//		  arr1_2[2] = String.valueOf( arr1[2]);
//		  arr1_2[3] =String.valueOf( arr1[3]);
//		  arr1_2[4] =String.valueOf( arr1[4]);
//		  System.out.println(arr1_2);
		 
		  

		  //===============Arrays 의 다양한 문법들====================// 

		  //배열내용을 출력하려고 할떄 사용하는 함수 Arrays.toString
		  //그래서 Arrays.toString() 이렇게 실행해야 한다.
		  
		//======세번째방법=======//
		//import java.util.Arrays;//
		  for (int i = 0; i < arr1.length; i++)  
			arr1_2[i]=arr1[i];
			System.out.println(Arrays.toString(arr1_2));
		//주의 for 의 대괄호는 없어야 1번만 반복 실행//		
		
		//======네 번째방법=======//	
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(Arrays.toString(arr2));
		
		
		//======다섯 번째방법=======//배열의  0 1 2 3 순서
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(Arrays.toString(arr3));
		
		//======여섯번째 방법=======//
		char[] arr4 = new char[arr1.length];
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//				   원본대상, 몇번째부터,복사대상,몇번째부터, 길이
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.out.println(Arrays.toString(arr4));
	}
}

			
			
