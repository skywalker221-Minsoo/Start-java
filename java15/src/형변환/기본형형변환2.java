package ����ȯ;

public class �⺻������ȯ2 {

	public static void main(String[] args) {
		
		int sum = 333;
		int count = 5;
		//����� ���� ���, �ϳ��� double�̸�
		//����� double�̴�.
		double a = (double)sum/count;
		//333�� 333.0, 333.0 / 5 = 66.6
		double b = (double)(sum/count); //���������� ����� ������ int!
		//333/5 = 66 ---> 66.0 
		//���������� ����� �����ؼ� double�� ����ȯ�� ����!
		//6.0 <--- (double)6
		System.out.println(a);
		System.out.println(b);

	}

}
