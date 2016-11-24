package homework6;

import java.util.*;

public class ExamVariousArray {

   public static void main(String[] args) {
      int c;
      Scanner s = new Scanner(System.in);

      System.out.println("1. 두번째로 큰 수 찾기");
      System.out.println("2. 심사 점수 계산");
      System.out.println("3. 학생 총점, 평균값 구하기");
      System.out.println("4. 5층 아파트의 거주자 숫자 구하기");
      System.out.println("5. 겹치지 않는 숫자 10개 입력받기");
      System.out.println("6. 종료하기");
      System.out.print("메뉴를 선택하세요. :  ");
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
        else if (c == 6) { System.out.println("프로그램을 종료합니다."); s.close();
        System.exit(0);
       
   }
   }
}

