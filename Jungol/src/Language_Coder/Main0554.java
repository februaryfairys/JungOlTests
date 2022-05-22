package Language_Coder;

import java.util.Scanner;

public class Main0554 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int a = 1;
      char b = 'A';
      sc.close();

      for (int i = 0; i < n; i++) {
         for (int j = n; j > i; j--) {
            System.out.print(a + " ");
            a++;
         }
         for (int k = 0; k <= i; k++) {
            System.out.print(b + " ");
            b++;
         }
         System.out.println();
      }

   }
}

//자연수 n을 입력받아서 n개의 줄에 n+1개의 숫자 혹은 문자로 채워서 다음과 같이 출력하는 프로그램을 작성하시오.
//3
//1 2 3 A
//4 5 B C
//6 D E F