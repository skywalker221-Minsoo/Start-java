package Ŭ���������;

public class MemberDAO {
   //��������, �ڵ��ʱ�ȭ
   //������������ ������ null�� �ʱ�ȭ!
   //url: �������, ��������(<->��������), ����������(<->�⺻������)
   String url = "jdbc:mysql://localhost:3306/shop";
   String user = "root";
   String password = "1234";
   
   //�ڹٴ� �޼��� �̸��� �Ȱ��� �� �� ����.
   //�޼����� ������ �Է°��� ���� �ϱ� �����̴�!
   //�ϳ��� �̸����� �������� ������ �޼��带 �����Ͽ� ȣ���� �� �ִ� ���
   //�����ε�(��(����) ��(��) ��)
   public void create(String id, String pw, String name) {
      //id, pw, name: ��������(local����)
      System.out.println("����� �Է��� id�� " + id);
      System.out.println("����� �Է��� pw�� " + pw);
      System.out.println("����� �Է��� name�� " + name);
   }
   
   public void create(String id, String pw, String name, String tel) {
	   //id, pw, name: ��������(local����)
	   System.out.println("����� �Է��� id�� " + id);
	   System.out.println("����� �Է��� pw�� " + pw);
	   System.out.println("����� �Է��� name�� " + name);
	   System.out.println("����� �Է��� tel�� " + tel);
   }
   
   public void create(String id, String pw) {
	   //id, pw, name: ��������(local����)
	   System.out.println("����� �Է��� id�� " + id);
	   System.out.println("����� �Է��� pw�� " + pw);
   }
   
   public void delete(String id) {
      //System.out.println(name);
      //���������� �ٸ� �޼��忡�� ���� �Ұ�
      System.out.println("����� �Է��� id�� " + id);
   }
   
   @Override
	public String toString() {
		return "MemberDAO [url=" + url + ", user=" + user + ", password=" + password + "]";
	}
}