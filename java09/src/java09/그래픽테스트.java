package java09;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class �׷����׽�Ʈ {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		
		JButton b = new JButton();
		b.setText("���� ������");
		b.setBackground(Color.red);
		f.add(b);
		
		Font font = new Font("�ü�", 1, 50);
		b.setFont(font);
		
		
		f.setVisible(true);

	}

}
