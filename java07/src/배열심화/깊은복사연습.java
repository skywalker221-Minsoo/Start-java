package �迭��ȭ;

public class �������翬�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title = {"����", "����", "����", "����", "��ǻ��"};
		int[] term1 = {100, 90, 70, 30, 50};
		int[] term2 = term1.clone();
		term2[3] = 55;
		term2[4] = 77;
		int count = 0;
		
		System.out.println(title[0] + " " + title[1] + " " + title[2] + " " + title[3] + " " + title[4]);
		System.out.println("1�б� ����");
		for (int i : term1) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("2�б� ����");
		for (int i : term2) {
			System.out.print(i + " ");
		}
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] > term1[i]) {
				count++;
			}
		}
		System.out.println();
		System.out.println("���� ���� �� : " + count);
	}
}
