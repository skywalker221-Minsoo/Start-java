package ����ȯ;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ����������ȯ4 {

	public static void main(String[] args) {
		//��ü������ �� 2�� ��Ģ
		//�ϳ��� Ŭ���� �ȿ��� �ϳ��� ���Ҹ��� �����ؾ� �Ѵ�.: ������(cohesion) ����
		//���ս� Ư���� Ŭ������ �����Ͽ� �����ϸ� �ȵȴ�.: ���յ�(coupling) ����
		
		�� toman = new ��(); //�����
		//�ϳ��� �̸����� �پ��� ���¸� �����Ͽ� ����ϴ� �ڹ��� �� Ư¡ : ������
		//�ڵ�����ȯ���� ����, �����ε�
		��� toman2 = new ��(); //�����ϴ� �ڵ�
		toman2 = new ���();
		toman2 = new ���۸�();
		//���յ��� ���� �ڵ�� ���������ϱ⵵ ����, �� ���� ������ ���� Ŭ������ ���浵 �����ϴ�!
		//�۾��絵 �پ���.
		
		ArrayList list2 = new ArrayList();
		
		List list = new ArrayList();
		list = new LinkedList();
	}

}
