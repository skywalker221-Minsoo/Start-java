package java09;

public class ī�信�������� {

	public static void main(String[] args) {
		int coffeePrice = 4600;
		int juicePrice = 4000;
		
		int coffeeCount = 5;
		int juiceCount = 3;

		���� cal = new ����();
		cal.add(coffeeCount, juiceCount); // ���� �ֹ��������?
		
		
		int coffee = cal.mul(coffeePrice, coffeeCount); // �հ� ���ϱ��?
		int juice = cal.mul(juicePrice, juiceCount);
		
		int final_result = cal.add(coffee, juice);
		System.out.println(final_result);
		
		int hour = cal.getHour();
		System.out.println("���� �ð��� " + hour);
	}
	
}
