package language_coder;
import java.util.Scanner;

public class Main0545 {

	public static void main(String[] args) {
		Main0545 x = new Main0545();
		x.count();

	}

	public void count() {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int cnta = 0;
		int cntb = 0;

		for (int i = 1; i <= 10; i++) {
			a = sc.nextInt();

			if (a % 3 == 0)
				cnta++;

			if (a % 5 == 0)
				cntb++;
		}
		sc.close();
		System.out.println("Multiples of 3 : " + cnta);
		System.out.println("Multiples of 5 : " + cntb);
	}
}
//10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
//10 15 36 99 100 19 46 88 87 13
//Multiples of 3 : 4
//Multiples of 5 : 3