package Language_Coder;
import java.util.Scanner;

public class Main0143 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int b = 0; b < i; b++) {
				System.out.print(" ");
			}
			for (int j = (2 * n) - 2 * i; j > 1; j--) {

				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= n - 1; i++) {

			for (int b = n - i; b > 1; b--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
//�ڿ��� n�� �Է¹޾� "��� ��"�� ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����! '*'�� '*'���̿� ������ ���� �ٻ��̿��� ������ ����.
//
//3
//
//*****
// ***
//  *
// ***
//*****