package Language_Coder;
import java.util.Scanner;

public class Main0149 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 1;
		sc.close();
		
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print(num + " ");
				num += 2;
				if (num > 10) {
					num = 1;
				}
			}
			System.out.println();
		}

	}

}
//�ڿ��� n�� �Է¹޾� "��� ��"�� ���� n x nũ�⿡ �������� �����Ͽ� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
//
//10 �̸��� Ȧ���� ����Ͻÿ�.
//
//����! ���ڴ� �������� �����ϵ� �ٻ��̿� ������ ����.
//
//3
//
//1 3 5
//7 9 1
//3 5 7