package �迭��ȭ;

public class ��Ʈ�����迭��3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "���� ���α׷�������";
		String s2 = "��¥!!";
		System.out.println(s + s2); // ��Ʈ�� ����
		System.out.println(s.concat(s2)); // ��Ʈ�� ����
		System.out.println(s.charAt(0)); // ���� 1���� ����
		System.out.println(s.endsWith("��")); // Ư���� ���ڷ� �������� Ȯ��
		System.out.println(s.substring(3)); // �ε���3 ���� ���� ��� ����
		System.out.println(s.substring(3, 8)); // �ε��� 3 ~ 7 ���� ����
		System.out.println(s.contains(s2)); // s�� s2�� ���ԵǾ� �ִ���?
		System.out.println(s.lastIndexOf("��")); // s�� "��"���� ��ġ
		System.out.println(s.toUpperCase()); // �빮�ڷ�
		System.out.println(s.toLowerCase()); // �ҹ��ڷ�
		System.out.println(s.length()); // ���ڼ�
		System.out.println(s.replace("��", "��"));
		
	}

}