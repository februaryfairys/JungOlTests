package Language_Coder;
import java.util.Scanner;

public class Main0150 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ar = new char[10];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.next().charAt(0);
		}
		for (int j = 9; j >= 0; j--) {
			System.out.print(ar[j] + " ");
		}
		sc.close();
	}

}
