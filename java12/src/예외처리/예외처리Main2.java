package ����ó��;

public class ����ó��Main2 {

	public static void main(String[] args) {
		�����߻�3 error = new �����߻�3();
		try {
			error.call();
		} catch (Exception e) {
			System.out.println("���ο��� ����ó����.");
			e.printStackTrace();
		}
		System.out.println("���� �߻� �� ����ɱ��?");
	}
}
