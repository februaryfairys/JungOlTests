package language_coder;
import java.util.Scanner;

public class Main0546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < a; i++) {
			int b = sc.nextInt();
			sum += b;
			avg = sum / a;
		}
		sc.close();
		
		System.out.printf("avg : %.1f\n", avg);
		
		if (avg >= 80) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

}
