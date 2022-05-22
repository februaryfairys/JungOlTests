package Language_Coder;
import java.util.Scanner;

public class Main0120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();

		int x = (i > j) ? i : j; /* 큰수 */
		int y = (j > i) ? i : j; /* 작은수 */
		int z = x - y;

/*		System.out.println(i);
		System.out.println(j);
		System.out.println(x); /* 큰수출력 */
//		System.out.println(y); /* 작은수출력 */ 
		System.out.print(z);
	}

}
