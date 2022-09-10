package begginer_coder;
import java.util.Scanner;

public class Main1338 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		sc.close();

		for (int i = 1; i <= n; i++) {// 고치지마
			for (int b = (n - 1); b >= i; b--) {
				System.out.print("  ");

			}
			for (int j = 1; j <= i; j++) {
				if (num >= 26) {
					num = (num % 26);

				}
				System.out.print((char)(num + 65)+ " ");
				num += n - j;
			}
			num = i;
			System.out.println();

		}
	}
}
//주어진 형태대로 높이가 N인 문자삼각형을 출력한다. 문자 사이는 한 개의 공백으로 구분한다.
//        A 
//      B F 
//    C G J 
//  D H K M 
//E I L N O 