package ����ƽ;

public class Recruitpeople {

	public static void main(String[] args) {
		
		Recruit man = new Recruit("ȫ�浿", "��", 25);
		Recruit man2 = new Recruit("��浿", "��", 26);	
		Recruit man3 = new Recruit("�۱浿", "��", 27);
				
		System.out.println(man);
		System.out.println(man2);
		System.out.println(man3);
		System.out.println("������ �� : " + Recruit.count);
		
		Recruit.getAvg();

	}

}