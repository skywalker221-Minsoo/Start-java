package ���ǹ�;

//import javax.swing.JFrame;
//import javax.swing.JButton;
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Font;
//
//public class �׷����Թ�2 {
//
//	public static void main(String[] args) {
//		JFrame f = new JFrame();
//		f.setSize(600, 800);
//		
//		JButton t1 = new JButton("New button");
//		f.getContentPane().add(t1, BorderLayout.NORTH);
//		
//		JButton btnNewButton_1 = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694.");
//		btnNewButton_1.setBackground(Color.YELLOW);
//		btnNewButton_1.setForeground(Color.BLACK);
//		btnNewButton_1.setFont(new Font("����", Font.BOLD, 40));
//		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
//
//	}
//
//}

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �׷����Թ�2 {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		f.setSize(600,800);
		
		t1 = new JTextField();
		f.getContentPane().add(t1, BorderLayout.NORTH);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("���� ������");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "��ư�� �����̱���.");
				t1.getText(); 
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 0));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		f.setVisible(true);

	}

}