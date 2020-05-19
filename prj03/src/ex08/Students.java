package ex08;

import java.util.Arrays;

public class Students {
	// 필드
		Student[] students;  // student 가 한사람에 대한 정보 num name 등등 5개 // 다시 stu
							// 즉 이말은 students라는 이름으로 Student[] 배열에 접근하겠다는 의미
		public Students(Student[] students) {
		}
			
		//method 

	public void output(Student[] students) {
		String msg = "";
		for (int i = 0; i < students.length; i++) {
			msg += students [i].num + "." 
				 + students [i].name+ ","
				 + students [i].jumsu1+ "\n";
		}
		
		System.out.println(msg);
	}
}
	

