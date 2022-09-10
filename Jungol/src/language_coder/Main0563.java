package language_coder;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main0563 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		TreeSet<Integer> ar = new TreeSet<Integer>();
//
//		for (int i = 0; i < 10; i++) {
//			ar.add(sc.nextInt());
//		}
//		
//		NavigableSet<Integer> descendingAr = ar.descendingSet();
//
//		for (int ar2 : descendingAr) {
//			System.out.print(ar2 + " ");
//			sc.close();
//		} //중복하는 숫자가 입력되면 그 중 1개만 출력... 60점 짜리

		int[] ar = new int[10];
		int temp = 0; // 스왑을 위한 임시 변수 선언

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		} // 정수 10개 입력받아 배열에 저장

		for (int i = 0; i <= ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) { // 아래와 같은 과정을
				if (ar[i] < ar[j]) { // 배열의 i값이 i+1값보다 작다면
					temp = ar[i]; // i값은 temp에 저장
					ar[i] = ar[j]; // j값을 i자리에 저장
					ar[j] = temp; // temp에 저장된 i값을 j에 저장
				}

			}

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
			sc.close();
		}
	}
}
