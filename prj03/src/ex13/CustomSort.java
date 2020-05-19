package ex13;

public class CustomSort {

	public static void display(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+"");
		}
		System.out.println();
	} //display int end

	public static void bubble_sort(int[] nums) {
		int n = nums.length;
		int temp = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if(nums[j]>nums[j+1]) {
					temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
				}
				
			} //for j end
			
		}// for i end
		
	} // bubble_sort(int[] nums) end
//--------------------------------------------------------------------//
	
	public static void display(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]+"");
		}
		System.out.println();
	} //display int end
	
	public static void bubble_sort(String [] names) {   
		int n = names.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				if(names[j].compareToIgnoreCase(names[j+1])> 0) { //names [j]는 모두 문자니깐 여기에서 문자니깐 compareTo 를 사용해야함  /문자열을 비교하기 위해서
					String temp = names[j];						//숫자에 대한 비교가 아니라 comparetoignorecase 는 0보다 큰지 작은지만 구별하면 됌 
					names[j] = names[j+1];
					names[j+1] = temp;
				}
			}
		} //for i end
		
	} //bubble_sort(String [] names) end

	//----------------------------
	
	public static void display(Student[] studs) {
		for (int i = 0; i < studs.length; i++) {
			System.out.println(studs[i].toString() + " ");
		}
		System.out.println();
		
	}

	public static void bubble_sort(Student[] studs, Type type) {
		int n = studs.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-1-i; j++) {
				switch (type) {
				case SNAME:
					if (studs[j].getName()
						.compareToIgnoreCase(
								studs[j+1].getName() ) > 0) {
					Student temp =  studs[j];
					studs[j] = studs[j+1];
					studs[j+1] = temp;
					
				}
					break;
				case STEL: 
					if (studs[j].getTel()
							.compareToIgnoreCase(
									studs[j+1].getTel() ) > 0) {
						Student temp =  studs[j];
						studs[j] = studs[j+1];
						studs[j+1] = temp;
						
					}
					break;
				case BYEAR: 
					if (studs[j].getbYear() >
					studs[j+1].getbYear() ) {
						Student temp =  studs[j];
						studs[j] = studs[j+1];
						studs[j+1] = temp;
						
					}
					break;
			}
				
				
					
				}
				
			}
			
		}

	
		
	}
		
	


