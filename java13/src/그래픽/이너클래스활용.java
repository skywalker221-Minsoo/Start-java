package �׷���;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Date;

public class �̳�Ŭ����Ȱ�� extends JFrame { // Jframe�� ��ӹ޾Ƽ� ����ϱ� �޼��带 ����ϱ� ����.
      JLabel count, img, day; // ���������� �����ؼ� ��ü���� ����� �� �ְ��Ѵ�.
      // ���� ������ �����带 �ϴ� innerclass�� �־�� �Ѵ�.
   public �̳�Ŭ����Ȱ��() { // �̳�Ŭ����Ȱ���� JFrame�� ��� �޾ұ� ������ JFrame�� �޼��带 ��ü ���� ����� �� �ִ�.
      
      setSize(800, 1000);
      getContentPane().setLayout(null);

      // �� �������� class ��ü���� ����� �� �ְ� �������� �ڸ��� �̵������ش�.
      // ���������� �̵��ϸ� ��ü ���� �ٷ� ����� �� �ִ�.
      count = new JLabel(""); // ���������� ����ϱ� ������ ��ü ���� ���� ����
      count.setFont(new Font("Dialog", Font.BOLD, 30));
      count.setBounds(280, 38, 310, 86);
      getContentPane().add(count);

      img = new JLabel("");
      img.setBounds(52, 122, 639, 656);
      getContentPane().add(img);

      day = new JLabel("");
      day.setFont(new Font("Dialog", Font.BOLD, 30));
      day.setBounds(68, 769, 623, 99);
      getContentPane().add(day);
      
      count2 c = new count2();
      c.start();
      Image2 i = new Image2();
      i.start();
      day2 d = new day2();
      d.start();

      setVisible(true);
   }

   public static void main(String[] args) {
      JFrame f = new JFrame("innerclass"); // ���� �̳�Ŭ������ Ȱ���ؼ� ���� ��ų ������ ����
      �̳�Ŭ����Ȱ�� g = new �̳�Ŭ����Ȱ��(); // �̳�Ŭ����Ȱ�� class���� Jframe�� ��ӹޱ� ���� ��ü ����
      // ���� ������ �� �̳�Ŭ����Ȱ�� class�� ���ο��� ����ϱ� ���� ��ü�� ������ �ش�.

   }// main 
   // main�� class ���̿� innerclass�� ���� �� �ִ�.
   public class count2 extends Thread {// ����Ŭ������ ó�� �����Ҷ� ������� ������ �� �ִ�.
      @Override // �������̵��� ���ؼ� run�� �������ؼ� ���
      public void run() {
         for (int i = 10; i >= 0; i--) {
            // System.out.println("count : " + i); // �ε������� �ϳ��� �������鼭 ��� 
            // JFrame�� ���� �־��ִ� �ɷ� ����
            count.setText("ī��Ʈ : " + i);
            try {
               Thread.sleep(1000); // 1���� �ǹ�(�������α׷� ����� �ӵ��������ִ� ���)
               // 500 -> 0.5���� �ǹ�
            } catch (Exception e) {
               // ���ͷ�Ʈ(����, �ߴ�) : ESC, ctrl+c, power-off, alt+f4 
            }
         }
      }
   }
   
   public class Image2 extends Thread {
      @Override
      public void run() {
         String[] list = {"�ٿ�ε�1.jfif", "�ٿ�ε�2.jfif", "�ٿ�ε�3.jfif", "�ٿ�ε�4.jfif", "�ٿ�ε�5.jfif"};
         // �ε��� ������ Ȱ���Ͽ� ���� ��� -> �迭 ���!
         int count2 = 2;
         for (int i = 0; i < list.length; i++) {
            // System.out.println("�̹��� : " + list[i] ); JFrame�� ���� �־��ִ� �ɷ� ����
            ImageIcon icon = new ImageIcon(list[i]); // �̹����� ���� �� �ִ� ��ü ����
            img.setIcon(icon); // �������� img�� icon�̹����� �ִ´�
            if (i == 4) {
               i = -1;
            }
            try {
               Thread.sleep(5000); // 5�ʿ� �ѹ��� ����
            } catch (Exception e) {
               
            }
            count2--;
            if (count2 < 0) { // �̷��� �׸� �ٲ�� 0.001�� ������ ���� �ٷ� �����ó�� ���δ�.
                break;
            }
         }
      }
   }
   
   public class day2 extends Thread{ // ���� Ÿ�������ε� ��� ����
      @Override // run�� �������ϴ� �������̵�
      public void run() {
    	 int count3 = 10;
         for (int i = 0; i < 1000; i++) { // 1000�� �ݺ�
            Date date = new Date(); // ��¥�� ��Ÿ���� ��ü ���
            // System.out.println("��¥ : " + date); JFrame�� ���� �־��ִ� �ɷ� ����
            day.setText(date + " ");
            try {
               Thread.sleep(1000); // 1ȣü �ѹ��� ����(�������α׷� ó���� ���ణ���� ������ �� �ִ�)
            } catch (Exception e) {
               
            }
            count3--;
            if (count3 < 0) { //�̷��� �ð� �ٲ�� 0.001���� ������ ���� �ٷ� ���ߴ� ��ó�� ���δ�.
            	break;
            }
         }
      }
   }



}// class