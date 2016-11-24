package homework6;

import java.util.*;

public class AvgScore {
   private double[] num;
   private int len;
   
   void start() {
      num = new double[5];
      len = num.length;
      this.input();
      this.print();
   }
   void input() {
      Scanner s = new Scanner(System.in);
      System.out.println("가장 큰 점수와 가장 작은 점수를 제외한 평균을 구합니다.");
      System.out.println("5개의 점수를 입력하세요. : ");
      
      
      for(int i=0;i<len;i++) {
         System.out.print(String.format("%02d", i+1) + "번 심사점수 입력: ");
         
         if(s.hasNextDouble())
            num[i] = s.nextDouble();
         else 
            return;
      }
      
      System.out.print("\n");
   }
   void print() {
      double avgScore = 0.0;
      
      for (int i=(len-1);i>=0;i--) {
         for (int j=1;j<=i;j++) {
            if (num[j-1]>num[j]) {
               double temp = num[j-1];
               num[j-1] = num[j];
               num[j] = temp;
            } 
         } 
      }
      
      for(int i=1;i<(len-1);i++)
         avgScore += num[i];
      
      avgScore = avgScore/8.0;
      
      System.out.println("가장 큰 점수와 가장 작은 점수를 제외한 평균은 " + String.format("%.1f", avgScore) + "입니다. \n");
   }
}
