package language_coder;
import java.util.Scanner;

public class Main0521 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();

		sc.close();

		int sum = i++ * --j;

		System.out.print(i + " ");
		System.out.print(j + " ");
		System.out.print(sum);
	}

}