package language_coder;
import java.util.Scanner;

public class Main0549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		int cnt = 0;
		int sum = 0;

		sc.close();
		for (;;) {
			num++;
			if (num % 2 == 1) {
				cnt++;
				sum += num;
				if (sum >= n) {
					System.out.print(cnt + " " + sum);
					break;
				}
			}
		}
	}
}
//자연수 n을 입력받고 1부터 홀수를 차례대로 더해나가면서 합이 n 이상이면 
//그 때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램을 작성하시오.