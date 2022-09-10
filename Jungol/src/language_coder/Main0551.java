package language_coder;
import java.util.Scanner;

public class Main0551 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		run(n);
	}

	public static void run(int n) {
		for (int j = 0; j < n; j++) {
			for (int b = 0; b < j; b++) {
				System.out.print(" ");
			}
			for (int i = n; i > j; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
//***
// **
//  *