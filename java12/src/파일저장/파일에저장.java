package ��������;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ���Ͽ����� {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("��¥�Է�");
		String s2 = JOptionPane.showInputDialog("�����Է�");
		String s3 = JOptionPane.showInputDialog("�����Է�");
		try {
			//�ش� ������ ��Ʈ��(stream, �������)�� �����.
			//��Ʈ���� Ư¡�� �ѹ����̴�!
			FileWriter f = new FileWriter("c:/data/" + s1 + ".txt");
			//������: ��ġ�� ��Ÿ�� �� �Ǿտ������� �� ���ִ� ���
			//�����: ���� ��ġ�� �����ؼ� ��������� ���ִ� ���
			f.write(s1 + "\n");
			f.write(s2 + "\n");
			f.write(s3 + "\n");
			f.close(); //stream���� ������ �Ѱ��ְ� ������ �ݵ�� �ݾƼ� ���ξ��־���Ѵ�!!!
					   //stream�� �� ���� ������ �ݵ�� �ڿ�����!!(������)
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���Ϸ� ���� �� �����߻�");
			System.out.println("���� ������ " + e.getMessage());
		}
		
	}

}
