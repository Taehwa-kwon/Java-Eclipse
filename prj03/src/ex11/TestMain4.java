package ex11;

public class TestMain4 {

	public static void main(String[] args) {
		Student s1 = new Student ("가연1","010-1111-1111",100);
		Student s2 = new Student ("가연2","010-1111-1112",90);
		Student s3 = new Student ("가연3","010-1111-1113",80);
		Student s4 = new Student ("가연4","010-1111-1114",70);
		Student s5 = new Student ("가연5","010-1111-1115",60);
		
		s1.info();
		s2.info();
		s3.info();
		s4.info();
		s5.info();
		
		//1번쨰 방법
		Student [] student0 = { s1,s2,s3,s4,s5 } ;
		
		//2번째 방법
		Student [] students = new Student [5]; //위에 내용을 클래스 배열로 뽑아내기
		students[0]=  new Student ("가연1","010-1111-1111",100);
		students[1]=  new Student ("가연2","010-1111-1112",90);
		students[2]=  new Student ("가연3","010-1111-1113",80);
		students[3]=  new Student ("가연4","010-1111-1114",70);
		students[4]=  new Student ("가연5","010-1111-1115",60);
		
		studends1_info(students);
		
		//3번째 방법. (2번과 유사함) 
		Student [] students2 = new Student [] { 
		new Student ("가연1","010-1111-1111",100),
		new Student ("가연2","010-1111-1112",90),
		new Student ("가연3","010-1111-1113",80),
		new Student ("가연4","010-1111-1114",70),
		new Student ("가연5","010-1111-1115",60)
		};
		
		//4번째 방법
		Student [] students3 = {//위에 내용을 클래스 배열로 뽑아내기
		new Student ("가연1","010-1111-1111",100),
		new Student ("가연2","010-1111-1112",90),
		new Student ("가연3","010-1111-1113",80),
		new Student ("가연4","010-1111-1114",70),
		new Student ("가연5","010-1111-1115",60)
	};
		
		
	
	}

	private static void studends1_info(Student[] students) { //student 는 students 의 배열을 받음
		for (int i = 0; i < students.length; i++) {
			System.out.println(i + " : ");
			students[i].info();
		}
		
	}

}
