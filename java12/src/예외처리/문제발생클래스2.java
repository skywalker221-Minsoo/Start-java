package ����ó��;	

public class �����߻�Ŭ����2 {

	public static void main(String[] args) {
		
		System.out.println("1. ���� ����Ʈ�� �� �� ����.");
		
		try {
			//������ �߻��� �� ���� �ڵ带 �־��ִ� �κ�.
			System.out.println("2. ���� �߻� �ڵ�" + 10/0);
		} catch (Exception e ) {
			//���ܻ�Ȳ�� �߻��ϸ�, ��Ƽ� ��� ó������ �ڵ带 �־��ִ� �κ�.
			System.out.println("������ �߻���.");
			System.out.println(e.getMessage());
		}
		System.out.println("3. ���� ����Ʈ�� �ɱ��?");
	}
}
