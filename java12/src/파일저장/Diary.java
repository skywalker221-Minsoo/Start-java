package ��������;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Diary {
	private static JTextField t1;
	private static JTextField t2;

	public void open() {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("�ϱ���");
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		
		JLabel date = new JLabel("\uC624\uB298\uC758 \uB0A0\uC9DC");
		date.setFont(new Font("����", Font.BOLD, 18));
		date.setBounds(42, 57, 116, 31);
		f.getContentPane().add(date);
		
		JLabel subject = new JLabel("\uC624\uB298\uC758 \uC81C\uBAA9");
		subject.setFont(new Font("����", Font.BOLD, 18));
		subject.setBounds(42, 104, 106, 31);
		f.getContentPane().add(subject);
		
		JLabel content = new JLabel("\uC624\uB298\uC758 \uB0B4\uC6A9");
		content.setFont(new Font("����", Font.BOLD, 18));
		content.setBounds(42, 209, 106, 31);
		f.getContentPane().add(content);
		
		t1 = new JTextField();
		t1.setBounds(170, 63, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(170, 111, 116, 21);
		f.getContentPane().add(t2);
		
		JTextArea t3 = new JTextArea();
		t3.setWrapStyleWord(true);
		t3.setColumns(10);
		t3.setRows(5);
		t3.setBounds(170, 177, 116, 101);
		f.getContentPane().add(t3);
		
		JButton save = new JButton();
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
				try {
					FileWriter file = new FileWriter("c:/data/" + s1 + ".txt");

					file.write(s1 + "\n");
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					file.close(); //3ĭ�� �� ���� ���� �Ѱ��ְ� �ݴ´�.
					JOptionPane.showMessageDialog(f, "���� �Ϸ�"); //������ ������ ����� �Ѵ�.
				} catch (IOException e2) {
					e2.printStackTrace();
					System.out.println("���Ϸ� ���� �� �����߻�");
					System.out.println("���� ������ " + e2.getMessage());
				}
				
				
			}
		});
		save.setBackground(Color.BLUE);
		save.setFont(new Font("����", Font.BOLD, 20));
		save.setBounds(62, 323, 205, 45);
		f.getContentPane().add(save);

		
		
		f.setVisible(true);
	}
}
