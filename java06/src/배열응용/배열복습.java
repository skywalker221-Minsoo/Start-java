package �迭����;

import java.util.Random;

public class �迭���� {

	public static void main(String[] args) {
		// �迭�� ����ϴ°��
		// 1. �迭�� ����� ���� �����͸� �𸣴� ���
		//    ������ ����� �ξ��ٰ� ���߿� �ִ´�.
		String[] name = {"ȫ�浿", "�ڱ浿", "���浿", "�̱浿"};
		int[] num = new int[5];
		Random r = new Random(42);
		
//		for (int i = 0; i < num.length; i++) {
//			num[i] = r.nextInt(100); // 0 ~ 99 ������ ������ ����
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
//		for (String s : name) {
//			System.out.print(s + " ");
//		}			
		// 2. �迭�� ����� ���� �����͸� �ƴ� ���
		//    �迭������ �� �ٷ� �����͸� �ִ´�.
		int[] num2 = {10, 20, 30, 40, 50}; // �������� : ���� ��(�ܺ� Ŭ����)������ ��� �Ұ�
		// num2 = �ּ�, �����Ͱ� �� ������ ������ ����
		// ��������
		// �� ���� �ȿ��� ��������� ������ ���� �ۿ����� �ν� �Ұ�
		// ������ ��������� ��ġ ���� �ȿ����� ��� ����
		// ������ ���� ��������°�? Ÿ�� ������;(����)
		// System.out.println(test);
		// 1. ��Ÿ! �ش� ������ �����ϴ��� Ȯ��
		// 2. Ư���� ���� �ȿ��� �� �� �ִ� ���������� �ƴ��� Ȯ��
		// 3. ����Ϸ��� �ϴ� ���κ��� �Ʒ����� ������� ���� �ƴ��� Ȯ��
		// test�� ��� �Ұ�. 58���ο����� ���� test�� ��������� ����.
		
		char[] gender = {'��', '��', '��', '��'};
//		for (int i = 0; i < gender.length; i++) {
//			System.out.print(gender[i] + " ");
//		}
//		for (char c : gender) {
//			System.out.print(c + " ");
//		}
//		System.out.println();
		
		boolean[] breakfast = {true, false, true, false};
//		for (int i = 0; i < breakfast.length; i++) {
//			System.out.print(breakfast[i] + " ");
//		}
//		for (boolean c : breakfast) {
//			System.out.print(c + " ");
//		}
//		System.out.println();
		
		double[] sight = {0.15, 2.0, 1.2, 0.8};
//		for (int i = 0; i < sight.length; i++) {
//			System.out.print(sight[i] + " ");
//		}
//		for (double c : sight) {
//			System.out.print(c + " ");
//		}
//		System.out.println();
		
		int[] age = {100, 200, 300, 400};
//		for (int i = 0; i < age.length; i++) {
//			System.out.print(age[i] + " ");
//		}
//		for (int c : age) {
//			System.out.print(c + " ");
//		}
		System.out.println();
		System.out.println("�̸�" + " " + "����" + " " + "��ħ" + " " + "����" + " " + "�÷�" + " ");
		System.out.println("----------------------");
		for (int i = 0; i < age.length; i++) {
			System.out.println(name[i] + " " + age[i] + " " + breakfast[i] + " " + gender[i] + " " + sight[i] + " ");
		}
		
	}

}
