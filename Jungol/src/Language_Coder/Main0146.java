package Language_Coder;
import java.util.Scanner;

public class Main0146 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		char cha = 'A';

		sc.close();
		if (n <= 6) {
			for (int i = 0; i < n; i++) {
				for (int j = n - i; j > 0; j--) {
					System.out.print(cha + " ");
					cha++;
				}
				for (int k = 0; k < i; k++) {
					System.out.print(num + " ");
					num++;
				}
				System.out.println();
			}
		}
	}
}
//�ڿ��� n(n��6)�� �Է¹޾� "��� ��"�� ���� �������� �����Ͽ� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����! ���ڴ� �������� �����ϵ� �ٻ��̿� ������ ����.
//
//3
//
//A B C
//D E 0
//F 1 2