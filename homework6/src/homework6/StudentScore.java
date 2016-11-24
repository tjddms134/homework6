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
      System.out.println("입력 받은 숫자 중 두번째로 큰 숫자를 구한다.");
      
      
      for(int i=0;i<len;i++) {
         System.out.print(String.format("%02d", i+1) + "번째 수를 입력하시오: ");
         
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
      
      System.out.println("두 번째로 큰 수는 " + (secondmaxindex+1) + "번째수 " + secondmax +" 입니다. \n");
   }
}