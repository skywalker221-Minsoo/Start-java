package ũ�Ѹ�;

import javax.swing.JFrame;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import ��������.Diary;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ũ�Ѹ�GUI {
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(350, 500);
		f.getContentPane().setLayout(null);
		
		JButton ũ�Ѹ� = new JButton("\uD06C\uB864\uB9C1");
		ũ�Ѹ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					ũ�Ѹ����忬���ٽ�.crawling();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		ũ�Ѹ�.setBounds(108, 365, 143, 45);
		f.getContentPane().add(ũ�Ѹ�);
		
		JLabel lblNewLabel = new JLabel("\uAC80\uC0C9\uD560 \uAE08\uC694\uC77C \uC6F9\uD230\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694.");
		lblNewLabel.setBounds(63, 56, 223, 35);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(93, 139, 158, 45);
		f.getContentPane().add(t1);
		t1.setColumns(10);;
		f.setVisible(true);

	}

}
