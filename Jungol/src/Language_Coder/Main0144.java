package Language_Coder;
import java.util.Scanner;

public class Main0144 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 1; i <= n; i++) {
			for (int b = 2 * n - 2 * i; b > 0; b--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
//�ڿ��� n�� �Է¹޾� "��� ��"�� ���� n�ٿ� ��ó ���������� ���ĵ� �ﰢ���� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
//����! '*'�� '*'���̿� ������ ���� �ٻ��̿��� ������ ����.
//
//3
//
//    *
//  ***
//*****