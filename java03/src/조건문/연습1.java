package ���ǹ�;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double temp = 3.141592;
//		System.out.printf("�Ҽ��� 1�ڸ������� %.1f ", temp);

		Float today_c;
		Float yesterday_c;
//		String pw1;
//		String pw2;

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����? ");
		today_c = sc.nextFloat();

		System.out.println("������ �����? ");
		yesterday_c = sc.nextFloat();

		float differ = yesterday_c - today_c;

//		System.out.println("������ ��ȣ��? ");
//		pw1 = sc.next();
//
//		System.out.println("��ȣ�� ��ÿ�. ");
//		pw2 = sc.next();

		if (Math.abs(differ) > 2) { // Math ���̺귯�� ���� ���� �Լ� ���
			System.out.println("������� ������ ���̹� ���� Ȯ��!");
		} else {
			System.out.println("������ �Ȱ��� ����������!");
		}

	}

}
