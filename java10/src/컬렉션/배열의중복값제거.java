package �÷���;

import java.util.HashSet;
import java.util.Random;

public class �迭���ߺ������� {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] num = new int[10000];
		for (int i = 0; i < num.length; i++) {
			num[i] = r.nextInt(10000);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + " : " + num[i]);
		}
		
		HashSet set = new HashSet();
		for (int i = 0; i < num.length; i++) {
			set.add(num[i]);
		}
		System.out.println(set);
		System.out.println(set.size());
		
	}

}
