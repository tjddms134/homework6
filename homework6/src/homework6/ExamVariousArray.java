package homework6;

import java.util.*;

public class ExamVariousArray {

   public static void main(String[] args) {
      int c;
      Scanner s = new Scanner(System.in);

      System.out.println("1. �ι�°�� ū �� ã��");
      System.out.println("2. �ɻ� ���� ���");
      System.out.println("3. �л� ����, ��հ� ���ϱ�");
      System.out.println("4. 5�� ����Ʈ�� ������ ���� ���ϱ�");
      System.out.println("5. ��ġ�� �ʴ� ���� 10�� �Է¹ޱ�");
      System.out.println("6. �����ϱ�");
      System.out.print("�޴��� �����ϼ���. :  ");
      c = s.nextInt();
      if (c == 1)
         new SecondMax().start();

      else if (c == 2)
         new AvgScore().start();

      
       else if (c == 3) new StudentScore().start();
      /*
        else if (c == 4) new AptPersonCount().start();
      
        else if (c == 5) new OnlyNumber().start();
       */
        else if (c == 6) { System.out.println("���α׷��� �����մϴ�."); s.close();
        System.exit(0);
       
   }
   }
}

