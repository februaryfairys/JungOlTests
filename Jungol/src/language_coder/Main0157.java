package language_coder;
import java.util.Scanner;

public class Main0157 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[] ar = new int[100];
      int cnt = 0;
      int sum = 0;
      for (int i = 0; i < ar.length; i++) {
         ar[i] = sc.nextInt();
         if (ar[i] == 0) {
            sc.close();
            break;
         }
         if (ar[i] % 5 == 0) {
            cnt++;
            sum += ar[i];
         }

      }
      System.out.println("Multiples of 5 : " + cnt);
      System.out.println("sum : " + sum);
      System.out.printf("avg : %.1f" , (double) sum / cnt);
   }

}