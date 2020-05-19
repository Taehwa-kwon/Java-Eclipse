package ex13;

public class TestMain {

	public static void main(String[] args) {
		String name1 = "이순신";
		String name2 = "李이이";
		
		//int result = name1.compareTo(name2);
		int result = name1.compareToIgnoreCase(name2);  // 문자열 비교 
		System.out.println(result);
		
		//----------------------------------------------------------------------------------------
		
		int [] nums = {8, 9, 3, 4, 7};
		CustomSort.display(nums);
		CustomSort.bubble_sort(nums);
		CustomSort.display(nums);
		
		//----------------------------------------------------------------------------------------
		
		String [] names = {"가연","나연","다연","라연","마연"};
		CustomSort.display(names);
		CustomSort.bubble_sort(names);
		CustomSort.display(names);
		
		//----------------------------------------------------------------------------------------
		  Student [] studs = new Student[] {
			new Student("이순신","010-1111-1234",1500),
			new Student("김유신","010-1111-1235",1700),
			new Student("아이유","010-1111-1236",1900),
			new Student("홍진경","010-1111-1237",1800),
			new Student("에일리","010-1111-1238",1850),
		  };
		CustomSort.display(studs);  //1: 이름 2: 전화 3:연도 
		CustomSort.bubble_sort(studs, Type.SNAME ); 
		//Type.SNAME : 
		CustomSort.display(studs);
		
	}	

	
}


