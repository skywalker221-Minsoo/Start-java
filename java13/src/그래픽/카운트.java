package 그래픽;

import javax.swing.JLabel;

public class 카운트 extends Thread {
	JLabel count;
	
	public 카운트(JLabel count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		for (int i = 500; i >= 0; i--) {
			count.setText("count : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				//인터럽트(방해, 중단) : esc, ctrl+c, power-off
			}
		}
	}
}
