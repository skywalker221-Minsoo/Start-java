package �÷���;

import java.util.ArrayList;

public class ����Ʈ�� {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//������ �ִ� �����͵��� ����
		
		list.add("�Ա�");
		list.add("���ñ�");
		list.add("�");
		//System.out.println(list.get(0));
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Object o : list) {
			System.out.println(o);
		}
		
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.add(1, "����");
		System.out.println(list);
		System.out.println(list.size());
	}

}
