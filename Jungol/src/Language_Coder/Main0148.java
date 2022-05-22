package Language_Coder;
import java.util.Scanner;

public class Main0148 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		sc.close();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}

		for (int i = 1; i < n; i++) {
			for (int b = 1; b <2 * i+1; b++) {
				System.out.print(" ");
			}
			for (int j = n - i - 1; j >= 0; j--) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}

	}

}

//자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//
//주의! '#'은 공백으로 구분하되 줄사이에 빈줄은 없다.
//
//3
//
//#
//# #
//# # #
//  # #
//    #
