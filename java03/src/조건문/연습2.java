package ���ǹ�;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		int i = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������? ");
		String food = sc.next();
		switch (food) {
		case "�н�":
			System.out.println("��ǳʷ�");
			break;
		case "���":
			System.out.println("��������");
			break;
		default:
			System.out.println("��ǳʷ�");
			break;
		}
	}

}
