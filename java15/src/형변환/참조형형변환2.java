package ����ȯ;

import java.util.ArrayList;
import java.util.Random;

public class ����������ȯ2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("ȫ�浿");
		list.add(new ��());
		list.add(new Random());
		list.add(new ���۸�());
		list.add(12);
		System.out.println(list);
		//list.get(0).charAt(0);
		//list.get(1).run();
		//String���� �߰��� �޼������ �ٷ� �� �� ����.
		//String�� �߰� ����� ����ϰ� ������ �ٽ� String���� ����ȯ���ָ� �ȴ�.
		//String(��) <--- Object(ū), (String)����
		String name = (String)list.get(0);
		System.out.println(name.charAt(1));
		
		�� man = (��)list.get(1); //��������ȯ, Ÿ���� �׻� �������ֵ��� ����.
		man.run();
		
		���۸� superman = (���۸�)list.get(3);
		superman.space();
		
		Random r = (Random)list.get(2);
		System.out.println(r.nextInt());
	}
}
