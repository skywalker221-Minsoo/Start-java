package shop;

import java.util.Date;

public class ���� {
	
	public int getHour() { // int �Լ��� �Ἥ ������� ��ȯ�Ѵ�!!
		Date date = new Date();
		int result = date.getHours(); // ����ð� return
		return result;
	}
	
	
	public int add(int a, int b) { // void�Լ� ���� return���� ���� ���� ����!!!!
		// �޼ҵ��� �Է°��� �ִ� ���,
		// �ԷµǴ� ���� Ÿ�԰� ���� ���� ������ ������־��
		// ���޵Ǵ� ���� �޾Ƽ� �����صξ��ٰ�
		// ������ ����� �� �ִ�.
		System.out.println("�� ���� ���� : "+ (a + b));
		int result = a + b;
		return result; // ������� ��ȯ�Ѵ�.
	}
	
	public int minus(int a, int b) {
		// a, b�� �߰��� ���� ���޹��� ������� �ؼ�
		// �Ű�ü ������ ���ִ� ���� : �Ű�����, parameter, �Ķ����
		// ���޹��� ���� 2���̸�, �Ű����� 2���� ������־����.
		// ���޹��� ���� ������� �Ű������� �����.
		// �̷��� ����� ���� ������ �޼��� ������ ó���ϰ� ��.
		System.out.println("�� ���� ���� : "+ Math.abs(a - b));
		int result = a - b;
		return result;
	}
	
	public int mul(int x, int y) {
		System.out.println("�� ���� ���� : "+ (x * y));
		int result = x * y;
		return result;
	}
	
	public double div(double x, double y) {
		System.out.printf("�� ���� �������� : %.2f", (x / y));
		double result = x / y;
		return result;
	}
	
}
