package ����ƽ;

import javax.swing.JOptionPane;

public class ����ƽ�޼����� {

	public static void main(String[] args) {
		// �ڹ���ü���� ���� ���� ���Ǵ� ����� ����ϰ��� �ϴ� ���
		// new�� ����ؼ� ��ü�� ������ �Ŀ� �޼��带 ����ϸ�
		// �ν��Ͻ������� ��� ���簡 �ǰ�, ������ ������ �����Ǵ� ��
		// �� ����� ���� ���ؼ� �ʹ� ���� ���ʿ��� �۾����� �̷������.
		// static�޼���� ����������, ��ü�������� �ʾƵ�
		// �ٷ� Ŭ�����̸����θ� �� ����� �� �� �ִ�.
		String s = "100";
		int n = Integer.parseInt(s);
		
		String s2 = JOptionPane.showInputDialog("�����Է�");
		int n2 = Integer.parseInt(s2);
		System.exit(0);

	}

}
