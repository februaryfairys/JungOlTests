package Language_Coder;
import java.util.Scanner;

public class Main0145 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		sc.close();

		for (int i = 1; i <= n; i++) {
			num = 1;
			for (int b = 2*(n - i); b > 0; b--) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
//�ڿ��� n�� �Է¹޾� "��� ��"�� ���� �������� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����! ���ڸ� �������� �����ϵ� �ٻ��̿� ������ ����.
//
//3
//
//    1
//  1 2
//1 2 3
