package �׷���;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class �̹��� extends Thread {
	JLabel image;
	
	public �̹���(JLabel image) {
		this.image = image;
	}
	@Override
	public void run() {
		String[] list = {"�ٿ�ε�1.jfif", "�ٿ�ε�2.jfif", "�ٿ�ε�3.jfif", "�ٿ�ε�4.jfif", "�ٿ�ε�5.jfif"};
		int i = 1;
		int pause = 0;
		while (i < list.length) {
			ImageIcon icon = new ImageIcon("�ٿ�ε�" + i + ".jfif");
			image.setIcon(icon);
			try {
				//�ʸ� ������ ���� �и���, 1/1000����.
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			i++;
			if (i == list.length) {
				//pause++;
				//i = 1;
				if(pause == 10) {
					break;
				}
			}
		}
	}
}
