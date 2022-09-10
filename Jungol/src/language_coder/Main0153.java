package language_coder;
import java.util.Scanner;

public class Main0153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		int i;
		for (i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] == -1) {
				sc.close();
				break;

			}

		}
		if (i > 2) {
			for (int j = i - 3; j < i; j++) {
				System.out.print(ar[j] + " ");
			}
		} else
			for (int j = 0; j < i; j++) {
				System.out.print(ar[j] + " ");
			}
	}
}
//100개의 정수를 입력받을 수 있는 배열을 선언한 후 정수를 차례로 입력 받다가 
//-1이 입력되면 입력을 중단하고 -1을 제외한 마지막 세 개의 정수를 출력하는 프로그램을 작성하시오. 
//(입력받은 정수가 -1을 제외하고 3개 미만일 경우에는 -1을 제외하고 입력받은 정수를 모두 출력한다.)
//
//30 20 10 60 80 -1
//
//10 60 80