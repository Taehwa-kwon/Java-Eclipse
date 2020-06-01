package B_thread1;

import java.awt.Toolkit;

public class BeepPrint2 {
	//소리와 띵이란 글자가 동시에 출력된다. 

	public static void main(String[] args) {
	//방법1. 별도 class로 작업
//		Runnable beepTask = new BeepTask(); 		//인터페이스 변수 선언하고 BeepTask객체를 생성 
//													// 한 인터페이스에 여러가지 객체를 생성가
//		Thread thread = new Thread(beepTask); //서브 스레드
//		
//		thread.start();//스레드 실행하라 ..start를 호출해야 run이 호출됌 
//		
//		for (int i = 0; i < 5; i++) { //메인 스레드 
//			System.out.println("띵");
//			try {
//				Thread.sleep(500);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
	//방법2. 익명 클래스로 처리
//		Thread thread = new Thread(new Runnable(){
//
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (Exception e) {
//					}
//				}
//			}
//		});
//		thread.start();
		
	//방법3. 람다식 사용 (버전에 따라 사용하는,, 익명클래스 혹은 람다식 )  원래 람다식이 인터페이스를 사용하는 거라서 눈에안보이는거지 결국 인터페이스 
		Thread thread  = new Thread(  () -> {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
		});
		thread.start();
		
		for (int i = 0; i < 5; i++) { //메인 스레드 
		System.out.println("띵");
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
			}
		}
	}
}
