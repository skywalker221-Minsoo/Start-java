package �迭����;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class �迭��ȭ���� {

	public static void main(String[] args) {
		String[] trip = new String[3];
		String[] trip2 = new String[3];
		
//		Scanner sc = new Scanner(System.in); // ��Ʈ�� ũ�� ���� �����ϰ��� �ȵǳ�...
//		System.out.println("�۳⿡ ���� �;��� ����? ");
//		trip = sc.next();
		for (int i = 0; i < trip.length; i++) {
			trip[i] = JOptionPane.showInputDialog("���� ������� ����? ");
			trip2[i] = JOptionPane.showInputDialog("�۳⿡ ����;��� ����? ");
		}
		for (int i = 0; i < trip.length; i++) {
			System.out.println(trip[i] + " " + trip2[i]);
		}
		int count = 0;
		for (int i = 0; i < trip.length; i++) {
			if (trip[i].equals(trip2[i])) {
				count++;
				System.out.println("��ġ�ϴ� ���� " + i);
			}
		}
		System.out.println("��ġ�ϴ� ������ " + count);
	}
}
