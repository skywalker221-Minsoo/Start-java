package yesterday;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ��������1 {

	public static void main(String[] args) {
		String physics = JOptionPane.showInputDialog("ü������ :  ");
		String math = JOptionPane.showInputDialog("�������� : ");
		String english = JOptionPane.showInputDialog("�������� : ");
		String korean = JOptionPane.showInputDialog("�������� : ");
		
		float avg = (Integer.valueOf(physics) + Integer.valueOf(math) +
				Integer.valueOf(korean) + Integer.valueOf(english)) / 4;
			
		JOptionPane.showMessageDialog(null, "��� : " + avg); // ���
		
		double pi = 3.141592;
		String round = JOptionPane.showInputDialog("������ : ");
		double round2 = Double.valueOf(round);
		double Static = pi * round2 * round2;
		JOptionPane.showMessageDialog(null, "���� : " + Static); // ���

//		String name;
//		int age;
//		double height;
//		String intro;
//		String buffer;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�̸��� �Է��ϼ���. ");
//		name = sc.next();
//		
//		System.out.println("���̸� �Է��ϼ���. ");
//		age = sc.nextInt();
//		
//		System.out.println("Ű�� �Է��ϼ���. ");
//		height = sc.nextDouble();
//		
//		System.out.println("�ڱ�Ұ��� �Է��ϼ���. ");
//		buffer = sc.nextLine();
//		intro = sc.nextLine();
//		
//		System.out.println("�̸��� " + name + " ���̴� " + age + " Ű�� " + height);
//		System.out.println(intro);
//
//		char pw1 = 'p';
//		char pw2 = 'q';
//		if (pw1 == pw2) { // true
//			System.out.println("PASS");
//		} else { // false
//			System.out.println("���Է�");
//		}
		
		double temp = 3.141592;
		System.out.printf("�Ҽ��� 1�ڸ������� %.1f ", temp);

		Float today_weight;
		Float yesterday_weight;
		String pw1;
		String pw2;

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �����Դ�? ");
		today_weight = sc.nextFloat();

		System.out.println("������ �����Դ�? ");
		yesterday_weight = sc.nextFloat();

		float differ = yesterday_weight - today_weight;

		System.out.println("������ ��ȣ��? ");
		pw1 = sc.next();

		System.out.println("��ȣ�� ��ÿ�. ");
		pw2 = sc.next();

		if (pw1.equals(pw2) && differ > 2) { // true
			System.out.println("���̾�Ʈ ����!!");
		} else {
			System.out.println("���� �ٽ� ����!");
		}

	}

}
