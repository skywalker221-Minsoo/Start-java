package �迭��ȭ;

public class ���������� {

   public static void main(String[] args) {
      int[] x = {100, 200, 300};
      //x: �ּ�(������)
      //x�� ����ִ� �ּҷ� �� ������ �ε����� ����!�ϰ� ��.
      //System.out.println(x.length); //�б� ���� ���� length�� ����
      //int[] y = x; //�迭�� �ּҸ� ����=> ���� ����
      int[] y = x.clone(); //�迭�� �ּҰ� ����Ű�� ������ ����� ����
      //=> ���� ����
      System.out.print("������ x: ");
      for (int a : x) {
         System.out.print(a + " ");
      }
      System.out.println();
      
      System.out.print("������ y: ");
      for (int a : y) {
         System.out.print(a + " ");
      }
      
      System.out.println("\n---------");
      x[0] = 999;
      System.out.print("������ x: ");
      for (int a : x) {
         System.out.print(a + " ");
      }
      System.out.println();
      
      System.out.print("������ y: ");
      for (int a : y) {
         System.out.print(a + " ");
      }
      
      
      

   }

}