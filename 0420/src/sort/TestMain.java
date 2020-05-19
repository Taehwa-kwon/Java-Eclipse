package sort;

public class TestMain {

	public static void main(String[] args) {
		String name1 = "이순신";
		String name2 = "이이";
		int result = name1.compareToIgnoreCase(name2); 	// 대소문자를 무시하고 문자열 비교 
		System.out.println(result);						// 음수면 
		// name1 == name2 : 0
		// name1 >  name2 : 양수
		// name1 <  name2 : 음수
		
		
		int [] nums = {8,3,4,7,1};		
		CustomSort.display_array(nums);
		CustomSort.bubble_sort(nums);
		CustomSort.display_array(nums);		
		
		String [] names = new String[] 
				{"이순신", "이이", "새종", "강감찬", "박문수", "방원이"};
		CustomSort.display_array(names);
		CustomSort.bubble_sort(names);
		CustomSort.display_array(names);
		
		//Student[] student = new Student[2];		//이게 스택영역에 student라는걸 만들고 2개의 자리를 만듬
		
		//student[0]= new Student("이순신", "010-1111-1111", 2019),	//new 를 통해 힙영역에 각각의 데이터를 저장함 
		//student[1]= new Student("아이유", "010-1111-2222", 2019)
		
		Student [] students = new Student[] {
			new Student("이순신", "010-1111-1111", 2019),	
			new Student("아이유", "010-1111-2222", 2019),	
			new Student("홍진영", "010-1111-3333", 2017),	
			new Student("유이", "010-1111-4444", 2018),	
			new Student("쩡연", "010-1111-5555", 2016)	
		};
		
		System.out.println("========================");
		CustomSort.display_Object(students);
		CustomSort.bubble_sort( students, 1 );
		// 1: name, 2:tel, 3:inYear
		System.out.println("========================");
		CustomSort.display_Object(students);
		
	}

	

}
