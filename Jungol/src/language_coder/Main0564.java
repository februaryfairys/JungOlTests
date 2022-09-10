package language_coder;
import java.util.Scanner;

public class Main0564 {
	public static char A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[26]; // 알파벳 갯수 카운팅
		int[] abc = new int[26]; // 알파벳 배열
		for (int i = 0; i < ar.length; i++) {
			ar[i] = 0; // 배열의 모든 값을 0으로 초기화.
			abc[i] = 65 + i; // 배열의 모든 값을 아스키 코드 알파벳 대문자에 해당하는 값으로 초기화.
		}

		while (true)

		{
			A = sc.next().charAt(0);
			// 알파벳 입력받음.
			if ((int) A < 65 || (int) A > 90) {
				break;
			} // 입력받는 범위 설정. 정수65 미만, 정수90 초과의 값이 입력되면 무한루프 탈출.

			for (int i = 0; i < ar.length; i++) {
				if ((int) A - 65 == i) {
					ar[i]++;
				}
			} // 입력받은 값을 정수로 변환, 65를 차감하여 배열의 인덱스와 일치하면 인덱스의 값 1개 증가.
				// ar[1] = 0(B), B 입력받음, B=66, 66-65 = 1, if (1 == ar[1]){ ar[1] = 1 }
		}

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				System.out.println((char) abc[i] + " : " + ar[i]);
			} // 배열원소의 모든 값 스캔, 원소의 값이 0이 아닐경우에만 출력.
		}
		sc.close();
	}
}

//영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고
//
//영문 대문자들에 대하여 1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.
//
//입력되는 문자의 개수는 2개 이상 100개 이하이다.
//A B C F F F B Z !
//A : 1
//B : 2
//C : 1
//F : 3
//Z : 1