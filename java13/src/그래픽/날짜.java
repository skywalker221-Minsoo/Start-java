package �׷���;

import java.util.Date;

import javax.swing.JLabel;

public class ��¥ extends Thread {
	JLabel day;
	
	public ��¥(JLabel day) {
		this.day = day;
	}
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			Date date = new Date();
			day.setText("��¥ : " + date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
