package ����ȯ;

import java.util.ArrayList;
import java.util.Random;

public class ����������ȯ5 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("ȫ�浿"); //0�� �ε���
		list.add(11.22);
		list.add(12);
		//boxing : int(�⺻��) ---> auto-boxiong ---> Integer(������) ---> upcasting ---> Object
		
		int num = (Integer)list.get(2);
		//unboxing : int(�⺻��) <--- auto-boxiong <--- Integer(������) <--- downcasting <--- Object
		
		System.out.println(list);
		//list.get(0).charAt(0);
		//list.get(1).run();
		//String���� �߰��� �޼������ �ٷ� �� �� ����.
		//String�� �߰� ����� ����ϰ� ������ �ٽ� String���� ����ȯ���ָ� �ȴ�.
		//String(��) <--- Object(ū), (String)����
		String name = (String)list.get(0);
		System.out.println(name.charAt(1));
		
	}
}
