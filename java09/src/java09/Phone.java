package java09;

public class Phone {
	String com;
	String color;
	String name;
	String text;
	String when;
	String inter;
	int size;
	int time;
	
	public void made() {
		if (com.equals("�Ｚ")) {
			System.out.println("������� �Ｚ�Դϴ�.");
		}
		else
			System.out.println("������� �����Դϴ�.");
	}
	
	public void num() {
		System.out.println("��ȭ��ȣ�� 010���� ���۵˴ϴ�.");
	}
	
	public void text(String name, String text, int size) {
		System.out.println("�޴� ��� : " + name);
		System.out.println("������ �޽��� : " + text);
		System.out.println("ũ�� : " + size);
		System.out.println("��ȭ��� �����ϴ�.");
	}
	
	public void internet(String inter, String when, int time) {
		System.out.println(inter + "�� " + when + " " + time + "�ð� ����ߴ�.");
		System.out.println("��ȭ��� ���ͳ��ϴ�.");
	}
}
