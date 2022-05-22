package Language_Coder;
import java.util.Scanner;

public class Main0145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		sc.close();

		for (int i = 1; i <= n; i++) {
			num = 1;
			for (int b = 2*(n - i); b > 0; b--) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
//자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력하는 프로그램을 작성하시오.
//
//주의! 숫자를 공백으로 구분하되 줄사이에 빈줄은 없다.
//
//3
//
//    1
//  1 2
//1 2 3
