package language_coder;
import java.util.Scanner;

public class Main0141 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		sc.close();
		for (;;) {

			if (n > 100 || n * i >= 100)
				break;

			else {
				System.out.print(n * i + " ");
				if (n * i % 10 == 0)
					break;
			}

			i++;
		}
	}

}

//1���� 100������ ���� �� �� ���� �Է¹޾� 100 ���� ���� ������� ���ʷ� ����ϴٰ� 
//10 �� ����� ��µǸ� ���α׷��� �����ϵ��� ���α׷��� �ۼ��Ͻÿ�.
//
//7
//
//7 14 21 28 35 42 49 56 63 70
