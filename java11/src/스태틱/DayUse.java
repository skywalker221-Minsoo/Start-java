package ����ƽ;

public class DayUse {

	public static void main(String[] args) {
		Day d1 = new Day("�ڹٰ���", 10, "����");
		System.out.println(Day.count); //�빮�ڷ� ���°� �� Static 
		Day d2 = new Day("����", 15, "������");
		System.out.println(Day.count);
		Day d3 = new Day("�", 11, "��Ʈ�Ͻ�");
		System.out.println(Day.count);

		System.out.println("��ü �ϴ� ���� �ð��� : " + Day.sum + "�ð�");
		System.out.println("��� �ϴ� ���� �ð��� : " + (double)Day.sum / Day.count + "�ð�");
		System.out.println("���� ������ �󸶳� ��𿡼� �ߴ��� ����Ʈ : " + d1);
		System.out.println("���� ������ �󸶳� ��𿡼� �ߴ��� ����Ʈ : " + d2);
		System.out.println("���� ������ �󸶳� ��𿡼� �ߴ��� ����Ʈ : " + d3);
		
		System.out.println("��ĥ �� �ߴ���? : " + Day.count + "��");		
	}

}