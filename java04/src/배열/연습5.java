package �迭;

import java.util.Random;

public class ����5 {

	public static void main(String[] args) {
		Random r = new Random(); // ������ ���� �Ҵ��ϴ� �Լ� import
		int[] num = new int[1000]; // int 1000�� ������ ���� �迭 ����
		int[] count = new int[4]; // �� ������ ���� ���� ���� �迭 ����
						
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000); // num �迭 �ȿ� 0~999 �� ���� 1000�� ��ġ
		}
		for (int j : num) {
			if (j >= 600) {
				count[0] += 1; // 600���� ũ�� count
			} else if (j >= 500) {
				count[1] += 1; // 600���� ���� �� �� 500���� ū �� count
			} else if (j >= 400) {
				count[2] += 1; // 50���� ���� �� �� 400���� ū �� count
			} else if (j >= 300) {
				count[3] += 1; // 400���� ���� �� �� 300���� ū �� count
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println((i+3) * 100 + " �̻��� ���� : " + count[i]);
		}
	}

}
