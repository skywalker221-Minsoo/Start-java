package �迭;

import java.util.Random;

import �迭����.�ٸ���Ű��Ŭ����;

// ���� ���� �ڵ� import : Ctrl + Shift + o

public class ����4 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int count = 0;
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1; // 45 = Seed��
			System.out.print(lotto[i] + " ");
		}
//		for (int i : lotto) {
//			System.out.print(i + " ");
//		}
		for (int x : lotto) {
			if(x >= 30) {
				count++;
			}
		}
		System.out.println("30�̻��� ���� ������ " + count + "��");
	}

}
