package �迭��ȭ;

public class ��Ʈ�����迭��2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String all = "����, ����, ����, ��ǻ��";
		//1. String[]�� �ٲٱ�
		String[] s = all.split(",");
		System.out.println(s[0] + s[1] + s[2] + s[3]);
		//2. ������ ���ԵǾ� �ִٸ�, ���� ���� �� �ٽ� �ֱ�
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].trim();
		}
		System.out.println(s[0] + s[1] + s[2] + s[3]);
		//3. ���� ��
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			count++;
		}
		System.out.println(count);
		//4. ��ǻ���� ��ġ
		for (int i = 0; i < s.length; i++) {
			if ( s[i].equals("��ǻ��")) {
				System.out.println(i);
			}
		}
		
		//5. ������� 3���� �̸��� ����?
		int count3 = 0;
		for (int j = 0; j < s.length; j++) {
//			String a = s[j];
//			char[] s2 = a.toCharArray();
//			int count2 = 0;
//			
//			for (int i = 0; i < s2.length; i++) {
//				count2++;
//			}
//			if (count2 < 3) {
//				count3++;
			if (s[j].length() < 3) {
				count3++;
			}
		}
		System.out.println(count3);

		
	}

}
