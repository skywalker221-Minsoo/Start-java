package �迭����;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class �Է��Ͽ��迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = new String[3]; // {null, null, null}
		JButton[] b = new JButton[3]; // {null, null, null}
		
		for (int i = 0; i < s.length; i++) {
			s[i] = JOptionPane.showInputDialog("������� ����? ");
		}
		
		for (String x : s) {
			System.out.print(x + " ");
		}
		
		// �迭 �� ���� Ȯ��
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("���ֵ�")) { // ���������� == �� ���� �ּҸ� ��!!
				System.out.println("���ֵ��� ����");
				System.out.println("��ġ�� " + i);
			}
		}
//		Scanner sc = new Scanner(System.in);
//		System.out.println("���� �ؾ��� ����? ");
//		todo_list = sc.next();
	}

}
