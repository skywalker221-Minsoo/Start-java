package Ŭ��������ϱ�;

import Ŭ���������.������;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		������ dog1 = new ������();
		������ dog2 = new ������();
		// dog1, dog2���� �ּҰ� �� ����.
		// new�� �Ҷ����� �������, �ҷ����� �Լ��� ���������. (ex) ������� �� 3�� + �ش� �Լ� 1��(������ ����Ű�� �ִ� �ּ�) = 4���� �ּ� 4���� ����ȴ�.)
		
		
		dog1.color = "����";
		// public���� �������� ������ �ٸ� ��Ű������
		// not visible
		dog1.type = "������";
		dog1.yall();
		
		dog2.color = "���";
		dog2.type = "���";
		dog2.walk();
	}	

}
