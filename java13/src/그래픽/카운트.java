package �׷���;

import javax.swing.JLabel;

public class ī��Ʈ extends Thread {
	JLabel count;
	
	public ī��Ʈ(JLabel count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		for (int i = 500; i >= 0; i--) {
			count.setText("count : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				//���ͷ�Ʈ(����, �ߴ�) : esc, ctrl+c, power-off
			}
		}
	}
}
