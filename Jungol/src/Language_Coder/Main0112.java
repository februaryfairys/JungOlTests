package Language_Coder;
import java.util.Scanner;

public class Main0112 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int a = i / j;
		int b = i % j;
		sc.close();

		System.out.print(i + " / " + j + " = " + a + "..." + b);

	}

}
