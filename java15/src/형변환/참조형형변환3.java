package ����ȯ;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ����������ȯ3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);;
		
		//�ڵ�����ȯ(LayoutManager(ū) <--- FlowLayout(��))
		f.setLayout(new FlowLayout());
		JButton me = new JButton("���� ������.");
		//�ڵ�����ȯ(Component(ū) <--- JButton(��))
		f.add(me);
		
		f.setVisible(true);
		
	}

}
