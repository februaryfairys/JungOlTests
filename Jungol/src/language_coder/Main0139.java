package language_coder;
import java.util.Scanner;

public class Main0139 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		for (int i = 1; i <= 9; i++) {
			if (a > b) {
				for (int j = a; j >= b; j--) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
			} else {
				for (int j = a; j <= b; j++) {
					System.out.printf("%d * %d = %2d   ", j, i, j * i);
				}
			}
			System.out.println();
		}
	}
}

//2���� 9������ �� �� 2���� �Է¹޾� �Է¹��� �� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�� �ݵ�� ���� �Էµ� ���� �����ܺ��� �Ʒ��� ���Ŀ� �°� ����Ͽ��� �Ѵ�.
//
//������ ������ ������ 3ĭ�̴�.
