package �迭;

public class ���͹��� {

	public static void main(String[] args) {
//		int[] ���� = new int[999];
//		int[] ���� = new int[999];

		int[] num = new int[5];
		//�迭�� �����͸� �ְų�, �����ų�, ��ġ���� �˰� �Ͱų�		
		for (int i = 0; i < num.length; i++) {
			System.out.println(i+1 + " : " + num[i]);
		}
		
		//�˾Ƽ� �ε��� 0���� �����ؼ� ������ 1�� �����ϸ鼭 �ϳ��� ��������.
		//for-each // �迭���� ������� ������ Ư���� ó��
		for (int i : num) {
			System.out.println(i);
		}
		
	}

}
