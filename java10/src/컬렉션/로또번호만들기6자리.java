package �÷���;

import java.util.HashSet;
import java.util.Random;

public class �ζǹ�ȣ�����6�ڸ� {

	public static void main(String[] args) {
		
		Random r = new Random();
		HashSet lotto = new HashSet();
		while(lotto.size()<6) {
			int num = r.nextInt(45) + 1;
			System.out.println("������ : " + num);
			lotto.add(num);
		}
		
		System.out.println(lotto);
		
	}
}
