package java09;

public class �ڵ�������������غ��� {

	public static void main(String[] args) {
		Car c1 = new Car(); // Car�� �־��� ������� color�� ������ �����.
		c1.color = "������";
		
		Car c2 = new Car();
		c2.color = "�Ķ���";

		// c1, c2�� ������ ������ �ּҰ� ��
		// �ּҰ� ����ִ� ������ ������ �޼���
		c1.run();
		c2.up();
	}

}
