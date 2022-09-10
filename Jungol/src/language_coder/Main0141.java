package language_coder;
import java.util.Scanner;

public class Main0141 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		sc.close();
		for (;;) {

			if (n > 100 || n * i >= 100)
				break;

			else {
				System.out.print(n * i + " ");
				if (n * i % 10 == 0)
					break;
			}

			i++;
		}
	}

}

//1부터 100까지의 정수 중 한 개를 입력받아 100 보다 작은 배수들을 차례로 출력하다가 
//10 의 배수가 출력되면 프로그램을 종료하도록 프로그램을 작성하시오.
//
//7
//
//7 14 21 28 35 42 49 56 63 70
