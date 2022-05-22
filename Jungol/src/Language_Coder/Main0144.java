package Language_Coder;
import java.util.Scanner;

public class Main0144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int b = 2 * n - 2 * i; b > 0; b--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
//자연수 n을 입력받아 "출력 예"와 같이 n줄에 걸처 오른쪽으로 정렬된 삼각형이 출력되는 프로그램을 작성하시오.
//주의! '*'과 '*'사이에 공백이 없고 줄사이에도 빈줄이 없다.
//
//3
//
//    *
//  ***
//*****