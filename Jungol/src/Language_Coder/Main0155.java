package Language_Coder;
import java.util.Scanner;

public class Main0155 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      char[] cAr = { 'J', 'U', 'N', 'G', 'O', 'L' };
      boolean b = false;
      char c = sc.next().charAt(0);
      sc.close();
      
      for (int i = 0; i < cAr.length; i++) {
         if (c == cAr[i]) {
            System.out.print(i);
            b = true;
         }
      }

      if (b != true) {
         System.out.print("none");
      }

   }

}