package ��������;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �α��� {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame("�α���");
		//static ����: ��ü�������� �ʾƵ� �������� Ŭ���� �̸����� �����ؼ�
		//			   �ٷ� �� ������ ���� ���� ���� �ִ� ����
		//			   �׷��� ���α׷������� Font�� �Ӽ�, Color�� �� ����
		//			   ���� ���Ƿ� static ������ �����ξ ���ϰ� �� �� �ִ�.
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		
		JLabel top = new JLabel("");
		top.setBounds(45, 39, 255, 128);
		f.getContentPane().add(top);
		
		ImageIcon icon = new ImageIcon("top.png");
		top.setIcon(icon);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_1.setBounds(57, 196, 93, 39);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(57, 245, 102, 35);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBackground(Color.YELLOW);
		t1.setForeground(Color.BLACK);
		t1.setBounds(184, 189, 116, 44);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(Color.YELLOW);
		t2.setForeground(Color.BLACK);
		t2.setColumns(10);
		t2.setBounds(184, 238, 116, 42);
		f.getContentPane().add(t2);
		
		JButton login = new JButton("");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText(); //id�Է�
				String s2 = t2.getText(); //pw�Է�
				//root, 1234 �����ϸ� "�α��� ����", �������� ������ "�α��� ����"
				if (s1.equals("root") && s2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "�α��� ����");
					Diary diary = new Diary(); // �ٸ� â�� �ҷ��´�.
					diary.open(); // �� â�� ����.
					f.dispose(); // �α���â�� �ݴ´�.
				} else {
					JOptionPane.showMessageDialog(f, "�α��� ����");
				}
			}
		});
		login.setBounds(34, 295, 125, 98);
		f.getContentPane().add(login);
		
		ImageIcon icon2 = new ImageIcon("btn1.png");
		login.setIcon(icon2);
		
		JButton reset = new JButton("");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//��ư�� Ŭ������ �� ó������
				//t1, t2 �Է��� ������ �����.
				t1.setText("");
				t2.setText("");				
			}
		});
		reset.setBounds(187, 295, 125, 98);
		f.getContentPane().add(reset);
		
		ImageIcon icon3 = new ImageIcon("btn2.png");
		reset.setIcon(icon3);
		
		f.setVisible(true);
	}
}
