package �ݺ���;

import javax.swing.JOptionPane;

public class �ݺ���while {

	public static void main(String[] args) {
		while (true) {
			String data = JOptionPane.showInputDialog("0>������, 1)���缮, 2)�ڸ��, 3)����");
			if (data.equals("3")) {
				System.out.println("��ǥ�ý����� �����մϴ�.");
				break;
			}

			switch (data) {
			case "0":
				System.out.println("������");
				break;
			case "1":
				System.out.println("���缮");
				break;
			case "2":
				System.out.println("�ڸ��");
				break;
			default:
				System.out.println("�ش� �������� �����ϴ�.");
				break;
			}
		}
	}
}
