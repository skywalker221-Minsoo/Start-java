package �迭����;

import java.util.Random;

public class ���� {

	public static void main(String[] args) {
		Random r = new Random();
		
		int[] ��� = new int[990];
		int[] ���� = new int[990];
		
		for (int i = 0; i < ���.length; i++) {
			���[i] = r.nextInt(4) + 1; // 1 ~ 4 ���� �Է�
			����[i] = r.nextInt(4) + 1;
			System.out.println(i+1 + " : " + "��� : " + ���[i] + " / ���� : " + ����[i]);
		}
		
		int count = 0;
		for (int i = 0; i < ���.length; i++) {
			if (���[i] == ����[i]) {
				count++;
			}
		}
		System.out.println("���� ���� : " + count);
	}

}
