package language_coder;
import java.util.Scanner;

public class Main0602 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ar = new String[5];
		String res = "";
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.next();
		}
		sc.close();

		for (int i = ar.length - 1; i >= 0; i--) {
			res += ar[i] + "\n";
		}
		System.out.println(res);
	}
}
