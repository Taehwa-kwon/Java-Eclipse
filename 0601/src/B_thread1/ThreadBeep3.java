package B_thread1;

import java.awt.Toolkit;

public class ThreadBeep3 {

	public static void main(String[] args) {
	//방법 1.
//		Thread thread = new BeepThread();
//		thread.start();
	//방법 2
		Thread thread = new Thread() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		};
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
