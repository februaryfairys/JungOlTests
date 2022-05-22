package Language_Coder;
import java.util.Scanner;

public class Main0562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int sumO = 0;
		int sumE = 0;

		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
//			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < 10; i += 2) {
			sumE = a[i + 1] + sumE;
			sumO = a[i] + sumO;
		}
		System.out.println("sum : " + sumE);
		System.out.printf("avg : %.1f", (double) sumO / 5);
		sc.close();
	}
	
}
//10개의 정수를 입력받아 배열에 저장한 후 짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
//
//평균은 반올림하여 소수첫째자리까지 출력한다.
//
//95 100 88 65 76 89 58 93 77 99
//
//sum : 446
//avg : 78.8