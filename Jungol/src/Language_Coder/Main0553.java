package Language_Coder;
import java.util.Scanner;

public class Main0553 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.close();
      char num = 'A';
      for (int i = 0; i < n; i++) {
         for (int j = n; j > i; j--) {
            System.out.print(num);
            num++;
         }
         System.out.println();
      }

   }

}