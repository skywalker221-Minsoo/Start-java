package Ŭ���������;

public class �Ž� {

	public static void main(String[] args) {
		// int x = 100;
		// Ÿ�� ������ = ��; (����)
		// Ŭ�������� ������ Ÿ������ ����� �� �ִ�.
		// Ŭ������ ������(��ü�� �̸�) = new Ŭ������();
		// ����(�Ӽ�, property, attribute)
		
		// ����(�Լ�, ���ó��, ��ɾ�)
		TV tv1 = new TV();
		TV tv2 = new TV();
		������ dog1 = new ������();
		������ dog2 = new ������();
		
		
		// tv1, tv2 ��ü�� ��������� ���� ����Ǿ�� �Ѵ�.
		// tv1, tv2 ��ü�� ��������� ������ ������ �ʿ�
		tv1.color = "������";
		tv1.size = 50;
		dog1.color = "������";
		dog1.size1 = 20;
		
		tv2.color = "������";
		tv2.size = 42;
		dog2.color = "Ȳ����";
		dog2.size1 = 11;
		
		System.out.println(tv1.color);
		System.out.println(tv1.size);
		System.out.println(tv2.color);
		System.out.println(tv2.size);
		tv1.on();
		tv1.off();
		dog1.bite();
		dog1.yall();
		dog2.laydown();
	}

}
