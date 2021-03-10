package �̳�Ŭ��������;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Arrays;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InnerClassPractice extends JFrame {

	JLabel subject, graph, next;
	
	public InnerClassPractice() {
		
		setSize(800, 850);
		getContentPane().setBackground(Color.yellow);
		
		subject = new JLabel();
		subject.setBounds(140, 50, 784, 100);
		graph = new JLabel();
		graph.setBounds(30, 39, 814, 791);
		next = new JLabel();
		next.setBounds(0, 761, 784, 0);
		subject.setFont(new Font("����", Font.BOLD, 40));
		next.setFont(new Font("����", Font.BOLD, 26));
		getContentPane().setLayout(null);
		
		getContentPane().add(subject);
		getContentPane().add(graph);
		getContentPane().add(next);
		
		JButton quit = new JButton("\uC885\uB8CC");
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //���� ��ư�� ������ â�� ������.
			}
		});
		quit.setBounds(282, 764, 209, 39);
		getContentPane().add(quit);
		
		
		graph2 g = new graph2();
		subject2 s = new subject2();
		
		g.start();
		s.start();
		
		setVisible(true);
	}

	public static void main(String[] args) { //InnerŬ������ ����� ����.
		InnerClassPractice p = new InnerClassPractice();
	}


	public class subject2 extends Thread {
		
		@Override
		public void run() {
			String[] list2 = {"�Ｚ����", "HMM", "������Ƽ�����̿��ĸ�", "īī��", "SK���̴н�", "��Ʈ",
					"��Ʈ��", "��������", "��Ʈ����", "�����"}; //�̹����� �����Ͽ� ������ ����� ����.
			int pause = 0; // �ѹ� ������ �� ���߰� �ϱ� ����.
			
			for (int i = 0; i < list2.length; i++) {
				subject.setText("���� : " + list2[i]); //�迭 ���� ȸ����� ���ʷ� ����Ѵ�.
				try {
					Thread.sleep(2000); //2�ʸ��� ��ȯ
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i == list2.length ) { //�迭�� ������ ���� �Ǹ� ���߰� �Ѵ�.
					pause++;
					if (pause == 1) { //������ ȸ���� 1���� �ϰ� ���߰� �Ѵ�.
						interrupt(); //������ ȸ�� ����.
					}
				}
			}
		}
	}
	
	
	public class graph2 extends Thread {
		
		@Override
		public void run() {
			
			String[] list = {"1.PNG", "2.PNG", "3.PNG", "4.PNG", "5.PNG", "6.PNG", 
					"7.PNG", "8.PNG", "9.PNG", "10.PNG", }; //����, �ֽı׷���
			
			int i = 0;
			int pause = 0;
			
			while(i < list.length) { //����� ���������� �̹������� ȸ�� 
				i++; //�̹��� ������ ���ʴ�� �ѱ��.
				ImageIcon icon = new ImageIcon(i + ".PNG");
				graph.setIcon(icon); //�̹��� ������ JFrame�� ��ġ��Ų��.
				try {
					Thread.sleep(2000); //2�ʸ��� ȸ��
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if(i == list.length) { //�̹������� ȸ���� �� �Ǹ�
					i = 1; //�ٽ� ó������ ���ư��� �Ѵ�. �׷��� ������ 1���� ���� ���߰� �� ��.
					++pause; //���������� ���� ������ �̹������� ���� �� ���߰� �Ѵ�.
					if (pause == 1) {
						//interrupt();
						break; // while���� �������� �׸��� ȸ���� �����. 
							   // �� �� interrupt�� �ȵǴ°� ���� while���� �ȸ����µ�...
					}
				}
			}
		}
	}
}