package Ŭ�������;

import java.util.Date;

public class ��ȯ�޾ƺ��� {

	public static void main(String[] args) {
		��ȯ������ re = new ��ȯ������();
		int[] zero = re.add();
		double one = re.add(7.6, 8);
		int two = re.add(7, 3);
		String three = re.add(83, "�ϴ�");
		String four = re.add("��", "���");
		re.add2();
		//void�� �޼��带 ȣ���ϴ� ��쿡��
		//������ �� ������� ���� �� ����!!
		//����Ʈ�� �ȵȴ�!!
		
		//�޼��带 ȣ���ϰ� ���� ��ȯ���� ���� ����
		//������ �� ������� ���� ���� �ְ�
		//����� ���� �ִ�.
		//String rest = re.add2(); => ��ȯ���� ���� ������ ���� �Ұ�
		//System.out.println(re.add2()); => ��������
		
		for (int x : zero) {
			System.out.print(x);
		}
		System.out.println();
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		
		String s; // �Ϲ�Ŭ������ ������ Ÿ������ ����� �� �ִ�.
		Date d = re.getDate();
		System.out.println(d);
		
		
	}

}
