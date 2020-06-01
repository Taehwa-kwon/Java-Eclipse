package B_thread1;

import java.awt.Toolkit;

public class BeepPrint1 {

	public static void main(String[] args) {
		//오시발...개쩌네 여기서 메인스레드는 위에서부터 아래로 차례차례로 실행을 하는데 나는 두개를 같이 실행하려면 어찌해야하는가?
		Toolkit toolkit = Toolkit.getDefaultToolkit();//여러가지기능이 있지만 이미지 파일을 로드하여 가져오는 기능 
		
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); //소리를 5번 내겠다. 
			try {
				Thread.sleep(2000); 	//Thread.sleep (1000=1초) 0.5초를 기다린다. 
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
