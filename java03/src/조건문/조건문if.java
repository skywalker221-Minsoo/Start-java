package ���ǹ�;

import java.util.Date;
import java.util.concurrent.locks.Condition;

import javax.swing.JButton;

public class ���ǹ�if {

	public static void main(String[] args) {
		// new Ű���� �̿�. DateƲ�� ���� ��ǰ�� ����.
		Date date = new Date(); // ��¥�� �ð��� ���� ������ �˷��ִ� class
		int hour = date.getHours(); // 24�ð����� �޴´�.
		System.out.println("���� �ð���" + hour + "��");
		if (hour <= 11) {
			System.out.println("�¸��");
		} else if (hour <= 16) {
			System.out.println("�¿����ʹ�");
		} else if (hour <= 22) {
			System.out.println("���̺��");			
		} else {
			System.out.println("�³���");
		}
	}
}
