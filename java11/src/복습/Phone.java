package ����;

public class Phone {

	String color;
	int size;
	
	public Phone(String color, int size) {
		//this : �ش� Ŭ������ �ǹ�
		//this.color : �ش� Ŭ���� �ؿ� �ٷ� ����� color��� �ǹ�
		//this�� ���������� �����Ҽ� �ִ�.
		//�������� ����/������ ������ �� ���������� ������ �������� ���
		super();
		this.color = color;
		this.size = size;
	}

	public void internet() {
		System.out.println("���ͳ��ϴ�.");
	}

	public void text() {
		System.out.println("�����ϴ�.");
	}

	@Override //������
	public String toString() {
		return "Phone [color=" + color + ", size=" + size + "]";
	}
	
}
