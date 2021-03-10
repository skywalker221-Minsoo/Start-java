package �̳�Ŭ��������;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

public class ThreadGraphic3 extends JFrame { //JFrame ��ӹ޾Ƽ� �������� �ٷ� ����.
											 //�������� ���� ������ �ʿ䰡 ����.
											 //���ʿ� JFrame�� ������ �ִ� ������ �� ������ �� �� �ִ�.
											 //��, setsize, setvisible �� �ϰ� open with ->
											 //Design ���� �� ����� �ְ� ���� �����ؾ� ��!!!
	
	JLabel count, image, day; //ȭ�鿡 ��� count, �̹���, ��¥
	
	public ThreadGraphic3() { //����(inner)Ŭ������ ��������ν� ���� �� �ڵ��� ���⵵�� ���δ�.
		setSize(800, 300); //JFrame ũ�� ����
		getContentPane().setBackground(Color.black); //�̹����� ���ֶ� ��������.
		
		count = new JLabel(); //JFrame ���� ������ �󺧵�.
		image = new JLabel();
		day = new JLabel();
		
		add(count, BorderLayout.WEST);//���ڸ� ���ʿ� ��ġ.
		add(day, BorderLayout.SOUTH);//��¥�� �Ʒ��ʿ� ��ġ.
		add(image, BorderLayout.CENTER);//�̹����� ���Ϳ� ���̵���.

		count.setForeground(Color.WHITE); // ����� �������̶� ���ڰ� �ߺ��̵��� ��������Ѵ�.
		count.setFont(new Font("����", Font.BOLD, 40));
		
		day.setForeground(Color.WHITE);
		day.setFont(new Font("����", Font.BOLD, 32));
		
		count2 c = new count2();//���� ������ ���� �Ʒ��� �� �Լ��� ������� ��ӹ޾Ƽ� ���.
							  //�ܺ� Ŭ����(ī��Ʈ, ��¥, �̹���)�� ������ �Ͽ� �ٷ� ���.
		day2 d = new day2();
		image2 e = new image2();
		
		c.start();//ī��Ʈ, ��¥, �̹��� ���� ����.
		d.start();
		e.start();
		setVisible(true);//ȭ�鿡 JFrame�� ���̰Բ� ���ش�.
	}
	
	/*
	 * public static void main(String[] args) { JFrame f = new JFrame("������ ���");
	 * //JFrame ���� ThreadGraphic3 t = new ThreadGraphic3(); //JFrame�� ��ӹ޾� �� �ȿ� �����带
	 * ����Ͽ� ���� ������ �ǰ� �Ѵ�. }
	 */
	
	public class image2 extends Thread { //�̹���.java �ܺ� Ŭ������ ������
		/*
		 * JLabel image; public image2(JLabel image) { this.image = image; }
		 */
		@Override
		public void run() {
			String[] list = {"�ٿ�ε�1.jfif", "�ٿ�ε�2.jfif", "�ٿ�ε�3.jfif", "�ٿ�ε�4.jfif", "�ٿ�ε�5.jfif"};
			//�׸� ������ �����Ǿ� �����Ƿ�, �迭�� ũ�⸸ŭ �̹����� ��� �ҷ��� ����.
			int i = 1;//�׸��� ����, count�� 10 �ɶ����� �׸��� ��� �ٲ�� �Ѵ�.
			int pause = 0;// count�� 500���� �����߱� ������, count�� 0 �̵Ǽ� ���߸� �׸� ��ȯ�� �ڿ����� ���ߵ��� ��.
			while (i < list.length ) {//�׸��� �ټ���°���� �� ���� �ٽ� ù��° �׸����� ���ư��� �Ϸ� ��.
				ImageIcon icon = new ImageIcon("�ٿ�ε�" + i + ".jfif");//������Ʈ�� �����Ų �̹��� ���ϵ��� ���������� �ҷ��� ����.
				image.setIcon(icon);//�̹����� JFrame �ȿ� ���� ����.
				try {
					Thread.sleep(5000);//�׸��� 5�ʸ��� �ٲ�� ��.(5000�и��� = 5��)
				} catch (InterruptedException e) {
				}
				i++;//�׸� ������ �ٲ�� ���������� ���, 5�ʸ��� �迭 ���� �׸��� ���� ������ �Ѿ��.
				if (i == list.length) {//5��° �׸����� �� �Դٸ�,
					pause++;//count�� ���⶧ ���� ���߰� �� ����.
					i = 1;//ù���� �׸����� ���ư���.
					if (pause == 10) {//count 10���� �׸��� �ٲ�Ƿ�, �׸��� 5�� �ٲ�� pause�� 1 �����Ѵ�.
									  //���� pause�� 10 �������� ���� count�� 0���� �ȴ�.
						break;//�� �� �׸� ��ȯ�� �����.
					}
				}
			}
		}
	}
	
	public class count2 extends Thread {//ī��Ʈ.java �ܺ� Ŭ���� ���
		/*
		 * JLabel count; public count2(JLabel count) { this.count = count; }
		 */
		@Override//������
		public void run() {
			
			for (int i = 500; i >= 0; i--) {
				count.setText("count : " + i);
				try {
					Thread.sleep(500);//0.5�ʸ��� count�� 1�� ����߸���.
				} catch (InterruptedException e ) {
				}
			}
		}
	}
	
	public class day2 extends Thread {//�̹���.java �ܺ� Ŭ���� ���
		/*
		 * JLabel day; public day2(JLabel day) { this.day = day; } // �̰� �ܺ� Ŭ������ ������ �ҿ��� �ִ�...
		 */
		@Override
		public void run() {
			
			for (int i = 0; i < 1000; i++) {
				Date date = new Date();//���� �ð��� ����.
				day.setText("��¥ : " + date);//���� �ð��� JFrame�� �ߵ��� �Ѵ�.
				try {
					Thread.sleep(1000);//�ð��� 1�ʸ��� ����ϴ°� �����ش�.
				} catch (InterruptedException e ) {
				}
			}
		}
	}
}
