package Ŭ�������;

import Ŭ���������.����;

public class ���»�� {

	public static void main(String[] args) {
		���� draw = new ����();
		���� draw2 = new ����();
		���� draw3 = new ����();
		
		System.out.println(draw.name);
		System.out.println(draw.withdraw);
		System.out.println(draw.money);
		
		draw.�����ϴ�("�̼���", "����ī��", 50000);
		draw.�����ϴ�("ȫ�浿", 50000);
		draw.����ϴ�(50000);
		
		draw2.�����ϴ�("�����", "����ī��", 70000);
		draw2.�����ϴ�("�����", 70000);
		draw2.����ϴ�(70000);
		
		draw3.�����ϴ�("����ȣ", "�ϳ�ī��", 40000);
		draw3.�����ϴ�("����ȣ", 40000);
		draw3.����ϴ�(40000);
	}
}
