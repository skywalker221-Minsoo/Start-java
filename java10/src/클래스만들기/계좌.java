package Ŭ���������;

public class ���� {
	public String name = "�豸";
	public String withdraw = "�ѱ�����";
	public int money = 100000;

	public void ����ϴ�(int money) {
		System.out.println("��ݱݾ� : " + money);
	}

	public void �����ϴ�(String name, String withdraw, int money) {
		System.out.println("�̸� : " + name + "�������� : " + withdraw + "�ݾ� : " + money);
	}


	public void �����ϴ�(String name, int money) {
		System.out.println("�̸� : " + name + "�ݾ� : " + money);
	}

	@Override
	public String toString() {
		return "���� [name=" + name + ", withdraw=" + withdraw + ", money=" + money + "]";
	}
	

}
