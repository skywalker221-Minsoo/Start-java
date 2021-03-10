package �̳�Ŭ��������;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class �����尭�������׽�Ʈ extends JFrame {

   // JFrame�� ������ �ִ� �޼���, ������� �� ������ �¾.
   // => ��ӹ���
   // ThreadGraphic3���� JFrame�� ���� �� �� �� ����.

   // JLabel ���������� ��������.
   // boolean stop �� �������. true�� false�� �̿���
   // run�޼ҵ带 �����Ű�� ������ �ñ����.
   JLabel count, image, day;
   Day2 day2;
   Image2 image2;
   private boolean stop;

   // �޼��带 �����ؼ� ����� ��
   // public Thread Graphic3() {}
   // public void open(); <<

   // �⺻ ������ ���, open �޼��� ���� ����Ұ���.
   public �����尭�������׽�Ʈ() {
      this.stop = false;// �⺻ stop ���� false <
      getContentPane().setBackground(Color.WHITE);
      setSize(800, 300);

      // �������� JLabel, �������� ���� ����� ������,
      // JLabel count (x) = >> ������ �ʿ����.
      // �� ����.
      count = new JLabel();
      image = new JLabel();
      day = new JLabel();

      // �� ���� ��ġ
      getContentPane().add(count, BorderLayout.WEST);
      getContentPane().add(image, BorderLayout.EAST);
      getContentPane().add(day, BorderLayout.SOUTH);

      Font font = new Font("�������", Font.BOLD, 50);
      count.setFont(font);
      day.setFont(font);
      // count �� day �� ��Ʈ ��������.

      // �̳�Ŭ���� Count2 �κ��� ��ü�� ����
      Count2 count2 = new Count2();
      count2.start();

      day2 = new Day2();
      day2.start();

      image2 = new Image2();
      image2.start();

      setVisible(true);
   }

   // method
   // �Ķ���� ������, ������ �����ε�

   public static void main(String[] args) {
      // ���θ޼ҵ带 �غ�
      �����尭�������׽�Ʈ t = new �����尭�������׽�Ʈ();
   }

   // �Ʒ��� �̳�Ŭ���� ����.
   // ���
   public class Count2 extends Thread {

      @SuppressWarnings("deprecation")
      @Override

      public void run() {

            for (int i = 50; i >= 0; i--) { // 500 ���� 1�� �����ϸ� 0���� �� 500�� ����
               count.setText("Count : " + i); // 499, 498, 497 ...
               try {
                  Thread.sleep(50);
                  // ������ �и������� (0.001��)
                  // 500 = 0.5��
                  // 0.5��(������ �ð�)���� ������ �����! ��� ���<
               } catch (InterruptedException e) {
                  // ���ͷ�Ʈ(����, �ߴ�) : esc, ctrl+c, power-off
               }
               if (i == 0) {
                  JOptionPane.showMessageDialog(count, "ī��Ʈ�� ����Ǿ����ϴ�");
                  image2.stop();
                  day2.stop();
               }
         }
         System.out.println("�����带 �����մϴ�."); //stop�� true�� �ɶ� ���
      }
   }

   public class Day2 extends Thread {
      @Override
      public void run() {

            for (int i = 0; i < 1000; i++) {
               Date date = new Date();
               day.setText(date + " ");
               try {
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
                  // ���ͷ�Ʈ(����, �ߴ�) : esc, ctrl+c, power-off
               }
            }
         }
   }

   public class Image2 extends Thread {
      @Override
      public void run() {
         String[] list = { "1.png", "2.png", "3.png", "4.png", "5.png" };
         for (int i = 0; i < list.length; i++) {
            ImageIcon icon = new ImageIcon(list[i]);
            // list �� ��� "����.png" ���ϵ��� ImageIcon ��ƿ�� ����Ͽ� �̹���ȭ.
            image.setIcon(icon);
            // setIcon�� ���� list icon list�� �ִ� �̹������� icon���� ��������.
            try {
               // �ʸ� ������ ���� �и�������, 1/1000����.
               Thread.sleep(5000);
            } catch (InterruptedException e) {
               // ���ͷ�Ʈ(����, �ߴ�) : esc, ctrl+c, power-off
            }
         }
      }
   }
}