package ������;

public class ���� {
	String name;
	String field;
	int money;
	//new ����() => ���Ұ�
	public ����(String name, String field, int money) {
		super();
		this.name = name;
		this.field = field;
		this.money = money;
	}

	@Override
	public String toString() {
		return "���� [name=" + name + ", field=" + field + ", money=" + money + "]";
	}

	
}
