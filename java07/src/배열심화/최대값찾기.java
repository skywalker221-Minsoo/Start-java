package �迭��ȭ;

import java.util.Random;

public class �ִ밪ã�� {

	public static void main(String[] args) {
		// Ÿ���� ������ ���� ���� �����Ͱ� ������ �迭�� �־��.
		// �ݺ��� ���ؼ� ���� ���� �����͸� ȿ�������� �ٷ� �� ����.
		// int[] num = {11, 33, 55, 22, 44};		
		Random r = new Random();
		int[] num = new int[1000];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(1000);
		}		
		int max = num[0];
		int index = 0;
		int count = 0;
		String sum = "";
		
		for (int i = 1; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
				index = i;
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] == num[index]) {
				sum = sum + i + " ";
				count++;
			}
		}
		String[] s = sum.split(" ");
		for (int i = 0; i < count; i++) {
			System.out.print(s[i] + " ");
		}
		System.out.println();
		System.out.println("�ִ� : " + max);
		System.out.println("�ִ� ��ġ : " + sum);
		System.out.println("�ִ� ���� : " + count);
	}

}
