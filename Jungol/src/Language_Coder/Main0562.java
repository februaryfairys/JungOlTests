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
//10���� ������ �Է¹޾� �迭�� ������ �� ¦�� ��° �Էµ� ���� �հ� Ȧ�� ��° �Էµ� ���� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����� �ݿø��Ͽ� �Ҽ�ù°�ڸ����� ����Ѵ�.
//
//95 100 88 65 76 89 58 93 77 99
//
//sum : 446
//avg : 78.8