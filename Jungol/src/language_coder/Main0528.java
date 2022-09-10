package language_coder;
import java.util.Scanner;

public class Main0528 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		sc.close();
		
		System.out.println(a);
		
		if (a < 0) {
			System.out.print("minus");
		}
	}
}
