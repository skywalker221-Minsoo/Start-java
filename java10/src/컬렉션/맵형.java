package �÷���;

import java.util.HashMap;

public class ���� {

	public static void main(String[] args) {
		HashMap dic = new HashMap();
		dic.put("���", "apple");
		dic.put("�ٳ���", "banana");
		dic.put("����", "pencil");
		System.out.println(dic);
		System.out.println(dic.size());
		System.out.println(dic.get("���"));
		dic.put(1, "one");
		System.out.println(dic);
	}

}
