package Language_Coder;
import java.util.Scanner;

public class Main0146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		char cha = 'A';

		sc.close();
		if (n <= 6) {
			for (int i = 0; i < n; i++) {
				for (int j = n - i; j > 0; j--) {
					System.out.print(cha + " ");
					cha++;
				}
				for (int k = 0; k < i; k++) {
					System.out.print(num + " ");
					num++;
				}
				System.out.println();
			}
		}
	}
}
//자연수 n(n≤6)을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//
//주의! 문자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//
//3
//
//A B C
//D E 0
//F 1 2