package language_coder;
import java.util.Scanner;

public class Main0138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		for (int j = 1; j <= a; j++) {
			for (int i = 1; i <= a; i++) {
				System.out.print("(" + j + ", " + i + ")" + " ");
			}
			System.out.println();
		}
	}

}

//������ �Է¹޾� ������ ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//
//
//* ���� 
//
// ')'�� '('���̿� ������ 1ĭ �ִ�.
//(1,_1) ó�� ����Ѵ� : '_'�� ����
//
//4
//
//(1, 1) (1, 2) (1, 3) (1, 4)
//(2, 1) (2, 2) (2, 3) (2, 4)
//(3, 1) (3, 2) (3, 3) (3, 4)
//(4, 1) (4, 2) (4, 3) (4, 4)