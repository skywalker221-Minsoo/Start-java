package �迭����;

import javax.swing.JOptionPane;

public class ���������Է� {

	public static void main(String[] args) {
		int[] num = new int[3]; // {0, 0, 0}
		for (int i = 0; i < num.length; i++) {
			String data = JOptionPane.showInputDialog("������ �Է� ");
			int data2 = Integer.parseInt(data);
			num[i] = data2;
		}
		for (int i : num) {
			System.out.print(i + " ");
		}
		int sum = 0; // ������ �ʱ�ȭ ���� ������? �����Ⱚ�� ����ִ�.(�����ν� �� �� ���� ����)
		for (int i : num) {
			sum = sum + i;
		}
		System.out.println();
		System.out.println("�� : " + sum);
		System.out.print(String.format("%.2f", sum / (double)num.length)); // �Ҽ��� ���. avg = sum / ǥ�� ��
	}

}
