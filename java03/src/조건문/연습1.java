package ���ǹ�;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double temp = 3.141592;
//		System.out.printf("�Ҽ��� 1�ڸ������� %.1f ", temp);
//		String pw1;
//		String pw2;
//		System.out.println("������ ��ȣ��? ");
//		pw1 = sc.next();
//
//		System.out.println("��ȣ�� ��ÿ�. ");
//		pw2 = sc.next();
		Float today_c;
		Float yesterday_c;


		Scanner sc = new Scanner(System.in); // �Է°��� �޴´�.
		System.out.println("������ �����? ");
		today_c = sc.nextFloat(); // �µ��� �������̹Ƿ� Float������ �޴´�.

		System.out.println("������ �����? ");
		yesterday_c = sc.nextFloat();

		float differ = yesterday_c - today_c;



		if (Math.abs(differ) > 2) { // Math ���̺귯�� ���� ���� �Լ� ���
			System.out.println("������� ������ ���̹� ���� Ȯ��!"); // ������ 2�� �Ѱ� ���̰� ����?
		} else {
			System.out.println("������ �Ȱ��� ����������!");
		}

	}

}
