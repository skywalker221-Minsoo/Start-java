package �÷���;

import java.util.ArrayList;
import java.util.LinkedList;

public class �迭����2 {

	public static void main(String[] args) {
		
		ArrayList award = new ArrayList();
		award.add("�ڽ�Ű");
		award.add("�۽�Ű");
		award.add("�轺Ű");
		award.add("����Ű");
		System.out.println(award);
		for (int i = 0; i < award.size(); i++) {
			System.out.println("�û��� " + (i+1) + "�� : " + award.get(i));
		}
		
		award.remove("�۽�Ű");
		for (int i = 0; i < award.size(); i++) {
			System.out.println("�û��� " + (i+1) + "�� : " + award.get(i));
		}
		

	}

}
