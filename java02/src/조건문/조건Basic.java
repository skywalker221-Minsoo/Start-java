package ���ǹ�;

import javax.swing.JOptionPane;

public class ����Basic {
	public static void main(String[] args) {

		String result = "";
		int i = 0;
		while (i < 4) {
			String food = JOptionPane.showInputDialog("�԰� ���� ���� �޴��� : "); // �Է°� String ���·� �ޱ�.
			if (food.equals("«��")) {
				result = "�߱�������";
				JOptionPane.showMessageDialog(null, result); 
			} else if (food.equals("�쵿")) {
				result = "�Ͻ�������";
				JOptionPane.showMessageDialog(null, result);
			} else if (food.equals("���")) {
				result = "�н�������";
				JOptionPane.showMessageDialog(null, result);
			} else {
				result = "������";
				JOptionPane.showMessageDialog(null, result);
			}
			i += 1;
		}

		String price = JOptionPane.showInputDialog("������ ����ϱ�? ");
		int money = 5000;

		if (price.equals("����")) { // �Է� String ���� ������ �Ǵ� ���ڿ��� ��
			JOptionPane.showMessageDialog(null, "����̱���!");
		} else if (price.equals("���")) {
			JOptionPane.showMessageDialog(null, "�����̱���!");
		} else {
			JOptionPane.showMessageDialog(null, "������ �򱺿�!");
		}
		int sales_price = money - 1000;

		String result2 = "";
		String vip = JOptionPane.showInputDialog("����� VIP�Դϱ�? ");
		if (vip.equals("yes")) {
			result2 = "yes";
		} else {
			result2 = "no";
		}
		if (result2.equals("yes")) {
			JOptionPane.showMessageDialog(null, "����� VIP �̹Ƿ� " + 
		"���ð� �����Ͽ� " + sales_price + "���Դϴ�."); // ���
		} else {
			JOptionPane.showMessageDialog(null, "����� VIP�� �ƴϹǷ� " +
		money + "���Դϴ�."); // ���
		}

		String result = "";
		int i = 0;
		while (i < 4) {
			String food = JOptionPane.showInputDialog("������ �Է��ϼ��� : ");
			int score = Integer.valueOf(food);

			if (score >= 90) {
				result = "A";
				JOptionPane.showMessageDialog(null, result); // ���
			} else if (score >= 80) {
				result = "B";
				JOptionPane.showMessageDialog(null, result); // ���
			} else if (score >= 70) {
				result = "C";
				JOptionPane.showMessageDialog(null, result); // ���
			} else {
				result = "D";
				JOptionPane.showMessageDialog(null, result); // ���
			}
			i += 1;
		}
	}
}
