package language_coder;
import java.util.Scanner;

public class Main0549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		int cnt = 0;
		int sum = 0;

		sc.close();
		for (;;) {
			num++;
			if (num % 2 == 1) {
				cnt++;
				sum += num;
				if (sum >= n) {
					System.out.print(cnt + " " + sum);
					break;
				}
			}
		}
	}
}
//�ڿ��� n�� �Է¹ް� 1���� Ȧ���� ���ʴ�� ���س����鼭 ���� n �̻��̸� 
//�� ������ ������ Ȧ���� ������ �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.