package homework6;

import java.util.*;

public class StudentScore {
   private int[] numArr;
   private int len;
   
   void start() {
      numArr = new int[5];
      len = numArr.length;
      this.input();
      this.print();
   }
   void input() {
      Scanner s = new Scanner(System.in);
      System.out.println("�Է� ���� ���� �� �ι�°�� ū ���ڸ� ���Ѵ�.");
      
      
      for(int i=0;i<len;i++) {
         System.out.print(String.format("%02d", i+1) + "��° ���� �Է��Ͻÿ�: ");
         
         if(s.hasNextInt())
            numArr[i] = s.nextInt();
         else
            return;
      }
      
      System.out.print("\n");
   }
   void print() {
      int max = Integer.MIN_VALUE;
      int secondmax = Integer.MIN_VALUE;
      int maxindex = 0, secondmaxindex = 0;
      
      for(int i=0;i<len;i++) {
         if(numArr[i] > max) {
            secondmax = max;
            secondmaxindex = maxindex;
            max = numArr[i];
            maxindex = i;
         }
         else if(numArr[i] > secondmax) {
            secondmax = numArr[i];
            secondmaxindex = i;
         }
      }
      
      System.out.println("�� ��°�� ū ���� " + (secondmaxindex+1) + "��°�� " + secondmax +" �Դϴ�. \n");
   }
}