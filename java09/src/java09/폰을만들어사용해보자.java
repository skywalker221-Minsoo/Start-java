package java09;

public class ������������غ��� {

	public static void main(String[] args) {
		Phone ph1 = new Phone();
		Phone ph2 = new Phone();
		
		ph1.color = "��ũ�׷���";
		ph2.color = "������ȭ��Ʈ";
		
		ph1.com = "����";
		ph2.com = "�Ｚ";
		
		ph1.made();
		ph2.made();
		
		ph1.num();
		ph2.num();
		ph1.text("ö��", "�¸��", 10);
		
		ph1.internet("���̹�", "����", 10);
	}

}
