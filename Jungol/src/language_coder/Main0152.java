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
//10���� ������ �Է¹޾� Ȧ�� ��° �Է¹��� ������ �հ� ¦�� ��° �Է¹��� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//10 20 25 66 83 7 22 90 1 100
//
//odd : 141
//even : 283