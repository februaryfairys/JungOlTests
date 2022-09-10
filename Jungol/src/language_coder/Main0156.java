package language_coder;
import java.util.Scanner;

public class Main0156 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int max = -999;
      int min = 999;

      int ar[] = new int[100];

      for (int i = 0; i < ar.length; i++) {
         ar[i] = sc.nextInt();
         if (ar[i] == 999)
            break;
         max = max < ar[i] ? ar[i] : max;
         min = min > ar[i] ? ar[i] : min;
      }

      System.out.println("max : " + max);
      System.out.println("min : " + min);
      sc.close();
   }

}