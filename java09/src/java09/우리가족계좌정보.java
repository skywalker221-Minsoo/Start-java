package java09;

public class �츮������������ {

	public static void main(String[] args) {
		�������� father = new ��������();
		�������� son = new ��������();
		�������� daughter = new ��������();
		
		father.name = "ȫ�浿";
		son.name = "�ڱ浿";
		daughter.name = "ȫ���";
		
		father.deposit_name = "ưư����";
		son.deposit_name = "ưư����";
		daughter.deposit_name = "��������";
		
		father.money = 1000;
		son.money = 2000;
		daughter.money = 3000;
		
		System.out.println("�츮 ���� ��������");
		System.out.println("------------");
		System.out.println("�̸� " + " �����̸� " + " �ݾ�");
		System.out.println(father.name + " " + father.deposit_name + " " + father.money);
		System.out.println(son.name + " " + son.deposit_name + " " + son.money);
		System.out.println(daughter.name + " " + daughter.deposit_name + " " + daughter.money);
		
		father.deposit("���");
		daughter.withdraw("�Ա�");
	}

}
