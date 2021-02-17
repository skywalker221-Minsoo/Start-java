package shop;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ����׷��� {
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField s2;
	private static JTextField s1;
	private static JButton btnNewButton_4;
	private static JButton btnNewButton_5;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(600, 600); // ������ â ũ�� ����
		f.getContentPane().setLayout(null);
		f.setVisible(true); // ������ ���� ������ â ���̵���.
		
		t4 = new JTextField();
		t4.setBounds(150, 39, 141, 36);
		f.getContentPane().add(t4);
		t4.setColumns(10);
		
		JButton btnNewButton = new JButton("\uB354\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t4.getText(); // �Է°� �ޱ�.
				String s2 = t5.getText();
				
				int x = Integer.parseInt(s1); // ���ڿ��� ���������� ��ȯ.
				int y = Integer.parseInt(s2);
				
				���� cal = new ����(); // �ٸ� Ŭ������ �Լ� ����.
				int result = cal.add(x, y); // �ٸ� Ŭ������ �Լ� ����.
				t3.setText("��갪 : " + result);
			}
		});
		btnNewButton.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.setBounds(316, 39, 122, 36);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBE7C\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t4.getText();
				String s2 = t5.getText();
				
				int x = Integer.parseInt(s1);
				int y = Integer.parseInt(s2);
				
				���� cal = new ����();
				int result = cal.minus(x, y);
				t3.setText("��갪 : " + result);
				
			}
		});
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_1.setForeground(Color.CYAN);
		btnNewButton_1.setBounds(450, 39, 122, 36);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB098\uB204\uAE30");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t4.getText();
				String s2 = t5.getText();
				
				double x = Integer.parseInt(s1);
				double y = Integer.parseInt(s2);
				���� cal = new ����();
				double result = cal.div(x, y);
				t3.setText("��갪 : " + Math.round(result*100.0)/100.0); // ��°�ڸ����� �ݿø�.
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_2.setBounds(450, 89, 122, 36);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uACF1\uD558\uAE30");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t4.getText();
				String s2 = t5.getText();
				
				int x = Integer.parseInt(s1);
				int y = Integer.parseInt(s2);
				���� cal = new ����();
				int result = cal.mul(x, y);
				t3.setText("��갪 : " + result);
			}
		});
		btnNewButton_3.setBackground(Color.YELLOW);
		btnNewButton_3.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_3.setBounds(316, 89, 122, 36);
		f.getContentPane().add(btnNewButton_3);
		
		t3 = new JTextField();
		t3.setFont(new Font("����", Font.BOLD, 30));
		t3.setBounds(35, 145, 256, 36);
		f.getContentPane().add(t3);
		t3.setColumns(10);
		
		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(150, 89, 141, 36);
		f.getContentPane().add(t5);
		
		s2 = new JTextField();
		s2.setHorizontalAlignment(SwingConstants.CENTER);
		s2.setBackground(Color.GREEN);
		s2.setText("\uC22B\uC7902");
		s2.setFont(new Font("����", Font.BOLD, 20));
		s2.setColumns(10);
		s2.setBounds(12, 89, 129, 36);
		f.getContentPane().add(s2);
		
		s1 = new JTextField();
		s1.setHorizontalAlignment(SwingConstants.CENTER);
		s1.setBackground(Color.GREEN);
		s1.setText("\uC22B\uC7901");
		s1.setFont(new Font("����", Font.BOLD, 20));
		s1.setColumns(10);
		s1.setBounds(12, 39, 129, 36);
		f.getContentPane().add(s1);
		
		btnNewButton_4 = new JButton("\uC81C\uACF1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t5.getText();
				
				int x = Integer.parseInt(s1);
				int result = x * x; // x^2
				t3.setText("�������� : " + result);
			}
		});
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setForeground(Color.ORANGE);
		btnNewButton_4.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_4.setBounds(451, 133, 122, 46);
		f.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("\uB8E8\uD2B8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t4.getText();
				
				double x = Math.sqrt(Integer.parseInt(s1)); // ������ �Լ�.
				double result = Math.round(x*1000.0)/1000.0; // ������ ���� �Ҽ� ��°�ڸ����� �ݿø�.
				t3.setText("������ : " + result);
			}
		});
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("����", Font.BOLD, 20));
		btnNewButton_5.setBackground(Color.BLACK);
		btnNewButton_5.setBounds(316, 135, 122, 46);
		f.getContentPane().add(btnNewButton_5);
		

	}
}
