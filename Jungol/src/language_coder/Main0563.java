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
//		} //�ߺ��ϴ� ���ڰ� �ԷµǸ� �� �� 1���� ���... 60�� ¥��

		int[] ar = new int[10];
		int temp = 0; // ������ ���� �ӽ� ���� ����

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		} // ���� 10�� �Է¹޾� �迭�� ����

		for (int i = 0; i <= ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) { // �Ʒ��� ���� ������
				if (ar[i] < ar[j]) { // �迭�� i���� i+1������ �۴ٸ�
					temp = ar[i]; // i���� temp�� ����
					ar[i] = ar[j]; // j���� i�ڸ��� ����
					ar[j] = temp; // temp�� ����� i���� j�� ����
				}

			}

		}
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
			sc.close();
		}
	}
}
