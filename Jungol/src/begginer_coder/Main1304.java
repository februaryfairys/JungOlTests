package begginer_coder;
import java.util.Scanner;

public class Main1304 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		sc.close();

		for (int j = 1; j <= n; j++) {
			num = j;
			for (int i = 0; i < n; i++) {

				System.out.print(num + " ");
				num += n;
			}
			System.out.println();

		}
	}

}
