package language_coder;
import java.util.Scanner;

public class Main0561 {

	public static void main(String[] args) {

		// 스캐너 선언, 변수배열선언, 초기값설정
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		int max = 0;
		int min = 10000;

		// 반복문과 가정문으로 조건 필터링
		for (int i = 0; i < 10; i++) {
			ar[i] = sc.nextInt();
			
			// 0 초과 100 미만일 때 가장 큰 값 출력
			if (ar[i] < 100) {
				if (ar[i] <= 0) { //범위 초과 시 max는 100
					max = 100;
				}
				max = ar[i] >= max ? ar[i] : max;

			}
			// 100 이상 10000 미만일 때 가장 작은 값 출력
			else if (ar[i] >= 100) {
				if (ar[i] >= 10000) { //범위초과시 min은 100
					min = 100;
				}
				min = ar[i] <= min ? ar[i] : min;

			}

		}
//		if (min == 10000) {
//			min = 100;
//		} else if (max == 0) {
//			max = 100;
//		}
		// 스캐너 폐쇄와 결과값 출력
		sc.close();
		System.out.print(max + " " + min);

	}

}
