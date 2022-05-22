package Language_Coder;
import java.util.Scanner;

class Person1 {

   void person1(String name, int height) {
      System.out.print(name + " " + height);
   }
}

public class Main0617 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] ar = new String[5];
      int[] ar2 = new int[5];
      int minHeight = 999;
      String name = null;
      Person1 p = new Person1();
      for (int i = 0; i < ar.length; i++) {
         ar[i] = sc.next();
         ar2[i] = sc.nextInt();
         if (ar2[i] < minHeight) {
            minHeight = ar2[i];
            name = ar[i];
         }
      }
      p.person1(name, minHeight);
      sc.close();
   }
}