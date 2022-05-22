package Language_Coder;
import java.util.Scanner;

public class Main0143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int b = 0; b < i; b++) {
				System.out.print(" ");
			}
			for (int j = (2 * n) - 2 * i; j > 1; j--) {

				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= n - 1; i++) {

			for (int b = n - i; b > 1; b--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
//자연수 n을 입력받아 "출력 예"와 같이 출력되는 프로그램을 작성하시오.
//
//주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
//
//3
//
//*****
// ***
//  *
// ***
//*****