package �迭��ȭ;

public class ��Ʈ�����迭�� {

	public static void main(String[] args) {
		String s = "����,����,����";
		String[] s2 = s.split(","); // ��ȣ �ȿ� �ִ°� �������� �ɰ��� �迭�� �־��ش�.
		int count = 0; 
		for (int i = 0; i < s2.length; i++) {
			count++;
		}
		System.out.println("������ ���� : " + count);
		
		String s3 = "          ȫ�浿";
		String s4 = s3.trim(); // ������ ���ش�.
		System.out.println(s4);
		
		String s5 = s3.replace("          ", ""); // �տ� �ִ� ���� �ڿ� �ִ°����� ��ü
		System.out.println(s5);
		String s6 = "ȫ�浿";
		char[] s7 = s6.toCharArray();
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
	}

}
