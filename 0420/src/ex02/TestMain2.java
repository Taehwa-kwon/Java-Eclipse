package ex02;

public class TestMain2 {
		//이건 여려명을 위한 클래스
	public static void main(String[] args) {
		
		//객체 배열을 사용할 준비
		Student[] stds = new Student[5];			// 스택에 stds - 5개 짜리 배열이 만들어짐(0~4) 
		
		stds[0] = new Student(1,"태화",90); 			// 힙에는 Student 라는곳에 num,name,jumsu가 생성됌  -- new 를 한다는것은 힙 영역을 생성하는 것 
		stds[1] = new Student(2,"지현",100);
		stds[2] = new Student(3,"은영",95);
		stds[3] = new Student(4,"은영2",95);
		stds[4] = new Student(5,"은영3",95);
		
		Students st = new Students();
		st.output(stds);		 //만약에 배열 3개를 만들고 호출하면 호출안됌 . nullpointException
		
		
		
		String [][] stds1 = new String[3][0];
		//3줄을 만들고
		
		stds1[0] = new String[1]; // 다시 stds1 에 String 1개를 만든다.
		stds1[1] = new String[2];
		stds1[2] = new String[1];
		
		
		stds1[0][0] = "2";
		stds1[1][0] = "2,d";
		stds1[1][1] = "2,d";
		stds1[2][0] = "2";
		
		for (int i = 0; i < stds1.length; i++) {
			for (int j = 0; j < stds1.length; j++) {
				System.out.println(stds1);
			}
		}
	System.out.println(stds1.toString());
		
	
		int [][] ar =new int [3][];
		int i,j=0;
		
		ar[0]=new int [1];
		ar[1]=new int [2];
		ar[2]=new int [3];
		
		ar[0][0]=10;
		ar[1][0]=20;
		ar[1][1]=30;
		ar[2][0]=10;
		
		System.out.println(ar.toString());
		
		
		
		

	}

}