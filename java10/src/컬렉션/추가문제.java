package �÷���;

import java.util.HashSet;

public class �߰����� {

	public static void main(String[] args) {
		String[] food = {"����", "����", "����", "����", "����"};
		HashSet del = new HashSet();
		
		for (int i = 0; i < food.length; i++) {
			del.add(food[i]);
		}
		System.out.println(del);
	}

}
