package �׷���;

import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

public class ī��Ʈ�ٿ� extends JFrame {
	//��ü�������� �ʾƵ� �������� static�޼��忡�� �����ؼ�
	//����Ϸ��� ��������� �ݵ�� static! �Ǿ�� �Ѵ�!!
	//static�� �ƴ� �Ϲ� ������ �ݵ�� ��ü�����ؾ� ����!!
	JLabel count, image, day;
	
	public ī��Ʈ�ٿ�() { //������ �޼���, inner Ŭ����
		setSize(900, 300);
		getContentPane().setBackground(Color.GREEN);

		count = new JLabel("count : 500");
		count.setFont(new Font("����", Font.BOLD, 26));
		getContentPane().add(count, BorderLayout.WEST);
		
		day = new JLabel("day");
		day.setFont(new Font("����", Font.BOLD, 32));
		getContentPane().add(day, BorderLayout.SOUTH);

		
		image = new JLabel();
		image.setFont(new Font("����", Font.BOLD, 40));
		getContentPane().add(image, BorderLayout.CENTER);
		//ImageIcon icon = new ImageIcon("�ٿ�ε�1.jfif");
		//image.setIcon(icon);
		
		//count thread
		//ī��Ʈ2 c = new ī��Ʈ2();
		//��¥2 d = new ��¥2();
		//�̹���2 e = new �̹���2();
		//c.start();
		//d.start();
		//e.start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ī��Ʈ�ٿ� t = new ī��Ʈ�ٿ�();
		ī��Ʈ c = new ī��Ʈ(t.count);
		��¥ d = new ��¥(t.day);
		�̹��� e = new �̹���(t.image);
		c.start();
		d.start();
		e.start();
	} //�����Լ�
	
	//������ �����ؾ��ϴ� 2Ŭ������ �ִٸ�, Ŭ�����ȿ� Ŭ������ �� �� �ִ�.
	//inner class, ����Ŭ����
	public class �̹���2 extends Thread {
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
					pause++;
					i = 1;
					if(pause == 10) {
						break;
					}
				}
			}
		}
	}

	public class ī��Ʈ2 extends Thread {
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
	
	public class ��¥2 extends Thread {
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
}
