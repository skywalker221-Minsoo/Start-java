package ���ǹ�;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;

public class �׷����Թ� {

	public static void main(String[] args) {
		JFrame f = new JFrame();	// ū Ʋ ����
		JButton b1 = new JButton();	// ���� �μ�ǰ ����
//		JButton b2 = new JButton();
//		JButton b3 = new JButton();
		f.setSize(500, 500); // ����x���� ����
		
		JButton b2 = new JButton("\uBD81\uCABD");
		f.getContentPane().add(b2, BorderLayout.NORTH);
		
		JButton b3 = new JButton("\uC911\uC559");
		b3.setFont(new Font("����", Font.PLAIN, 18));
		b3.setForeground(Color.YELLOW);
		b3.setBackground(Color.RED);
		f.getContentPane().add(b3, BorderLayout.CENTER);
		
		JButton b4 = new JButton("\uC67C\uCABD");
		b4.setForeground(Color.GREEN);
		b4.setFont(new Font("����", Font.PLAIN, 12));
		f.getContentPane().add(b4, BorderLayout.WEST);
		
		JButton b5 = new JButton("\uC624\uB978\uCABD");
		f.getContentPane().add(b5, BorderLayout.EAST);
		
		JButton b6 = new JButton("\uC544\uB798\uCABD");
		f.getContentPane().add(b6, BorderLayout.SOUTH);
//		f.add(b1); // ��ư�� JFrame ���� �ϳ� ��ġ
//		b1.setText("���� ������"); // ��ư �� ���� �Է�
		
		
		
		
		
		
		f.setVisible(true);
		
	}

}
