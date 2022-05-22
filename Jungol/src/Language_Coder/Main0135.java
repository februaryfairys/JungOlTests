package Language_Coder;
import java.util.Scanner;

public class Main0135 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		double avg = 0;
		if (a <= b) {
			for (int i = a; i <= b; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
					avg++;
				}
			}
		} else {
			for (int i = b; i <= a; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
					avg++;
				}
			}
		}
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (sum / avg));
		sc.close();
	}

}
