package �׷������α׷�;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import java09.����;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �������α׷� {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField answer;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.getContentPane().setForeground(Color.WHITE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC22B\uC7902");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 35));
		lblNewLabel.setBounds(65, 107, 167, 56);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7901");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 35));
		lblNewLabel_1.setBounds(65, 18, 167, 56);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setFont(new Font("����", Font.BOLD, 35));
		t1.setForeground(Color.RED);
		t1.setBounds(244, 18, 173, 56);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setFont(new Font("����", Font.BOLD, 35));
		t2.setForeground(Color.RED);
		t2.setColumns(10);
		t2.setBounds(244, 107, 173, 56);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("\uB354\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("���ϱ� ��ư Ŭ����.");
				// t1, t2�� �Է��� ���� ������ �;���.
				String s1 = t1.getText(); // ���� 1�� �Է�. �� ���� ���ڿ��̴�.
				String s2 = t2.getText(); // ���� 2�� �Է�.
				System.out.println(s1);
				System.out.println(s2);
				
				int i1 = Integer.parseInt(s1); // ���ڿ��� ���� �Է°��� ������ ��ȯ.
				int i2 = Integer.parseInt(s2);
				
				���� cal = new ����(); // java09��Ű���� ���� Ŭ���� ���.
				int result = cal.add(i1, i2);
				answer.setText("��갪 : " + result);
			}
		});
		btnNewButton.setForeground(Color.CYAN);
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(12, 241, 99, 191);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBE7C\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("���� ��ư Ŭ����.");
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				���� cal = new ����();
				int result = cal.minus(i1, i2);
				answer.setText("��갪 : " + result);
			}
		});
		btnNewButton_1.setBackground(new Color(255, 200, 0));
		btnNewButton_1.setBounds(135, 241, 99, 191);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uACF1\uD558\uAE30");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("���ϱ� ��ư Ŭ����.");
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				int i1 = Integer.parseInt(s1);
				int i2 = Integer.parseInt(s2);
				
				���� cal = new ����();
				int result = cal.mul(i1, i2);
				answer.setText("��갪 : " + result);
			}
		});
		btnNewButton_2.setForeground(Color.YELLOW);
		btnNewButton_2.setBackground(Color.BLUE);
		btnNewButton_2.setBounds(256, 241, 99, 191);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uB098\uB204\uAE30");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("������ ��ư Ŭ����.");
				String s1 = t1.getText();
				String s2 = t2.getText();
				System.out.println(s1);
				System.out.println(s2);
				
				double i1 = Integer.parseInt(s1);
				double i2 = Integer.parseInt(s2);
				
				���� cal = new ����();
				double result = cal.div(i1, i2);
				answer.setText("��갪 : " + Math.round(result*100.0)/100.0);
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.DARK_GRAY);
		btnNewButton_3.setBounds(373, 241, 99, 191);
		f.getContentPane().add(btnNewButton_3);
		
		answer = new JTextField();
		answer.setBackground(Color.BLUE);
		answer.setForeground(Color.WHITE);
		answer.setFont(new Font("����", Font.BOLD, 35));
		answer.setColumns(10);
		answer.setBounds(65, 175, 352, 56);
		f.getContentPane().add(answer);
		f.setVisible(true);
	}
}
