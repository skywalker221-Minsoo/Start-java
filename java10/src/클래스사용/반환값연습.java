package Ŭ�������;

import java.util.Date;

public class ��ȯ������ { // return �Ǵ� type�� ���־�� �Ѵ�!!

	public void add2() {
		System.out.println("���ϱ� ��� ����");
	}

	public int add(int x, int y) {
		return x + y;	
	}

	public double add(double x, int y) {
		return x + y;
	}

	public String add(String x, String y) {
		return x + y;
	}

	public String add(int x, String y) {
		return x + y;
	}

	public int[] add() {
		int[] x = {1, 2, 3};
		return x;
	}
	
	public Date getDate() {
		Date date = new Date();
		return date;
	}
}
