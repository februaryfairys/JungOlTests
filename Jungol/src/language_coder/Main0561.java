package language_coder;
import java.util.Scanner;

public class Main0561 {

	public static void main(String[] args) {

		// ��ĳ�� ����, �����迭����, �ʱⰪ����
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		int max = 0;
		int min = 10000;

		// �ݺ����� ���������� ���� ���͸�
		for (int i = 0; i < 10; i++) {
			ar[i] = sc.nextInt();
			
			// 0 �ʰ� 100 �̸��� �� ���� ū �� ���
			if (ar[i] < 100) {
				if (ar[i] <= 0) { //���� �ʰ� �� max�� 100
					max = 100;
				}
				max = ar[i] >= max ? ar[i] : max;

			}
			// 100 �̻� 10000 �̸��� �� ���� ���� �� ���
			else if (ar[i] >= 100) {
				if (ar[i] >= 10000) { //�����ʰ��� min�� 100
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
		// ��ĳ�� ���� ����� ���
		sc.close();
		System.out.print(max + " " + min);

	}

}
