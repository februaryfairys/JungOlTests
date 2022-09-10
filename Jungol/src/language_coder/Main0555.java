package language_coder;
import java.util.Scanner;

public class Main0555 {

	public static void main(String[] args) {
		
		
		char[] a = new char[10];
		Scanner sc = new Scanner(System.in);
	//	String A = sc.nextLine();
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
		}

		sc.close();

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);

		}
	}
}
