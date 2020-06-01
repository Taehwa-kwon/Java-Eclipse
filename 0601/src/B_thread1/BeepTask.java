package B_thread1;

import java.awt.Toolkit;
	
public class BeepTask implements Runnable{ //쓰레드를 할려면 implements Runnable 이걸 해줘야 한다. Runnable인터페이스안에는 run하나밖에 없다.
	//예를 들어 마우스리스너를 보면 얘는 5개가 가지고 있으니깐 전부다 재정의함. 

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	

}
