package �迭;

public class �迭�����2 {

	public static void main(String[] args) {
		double[] num = new double[3];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(i + " : " + num[i]);
		}
		for (double y : num) {
			//for-each������ y�� num.length��ŭ ����
			System.out.println(y);
		}
	}

}
