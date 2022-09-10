package language_coder;
import java.util.Scanner;

public class Main0152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		int oddSum = 0;
		int evenSum = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

		for (int i = 0; i < ar.length; i += 2) {
			oddSum += ar[i];
			evenSum += ar[i + 1];
		}
		System.out.println("odd : " + oddSum);
		System.out.println("even : " + evenSum);
		sc.close();
	}

}
//10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
//
//10 20 25 66 83 7 22 90 1 100
//
//odd : 141
//even : 283