package Language_Coder;
import java.util.Scanner;

public class Main0148 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		sc.close();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}

		for (int i = 1; i < n; i++) {
			for (int b = 1; b <2 * i+1; b++) {
				System.out.print(" ");
			}
			for (int j = n - i - 1; j >= 0; j--) {
				System.out.print("#" + " ");
			}
			System.out.println();
		}

	}

}

//�ڿ��� n�� �Է¹޾� "��� ��"�� ���� �������� �����Ͽ� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����! '#'�� �������� �����ϵ� �ٻ��̿� ������ ����.
//
//3
//
//#
//# #
//# # #
//  # #
//    #
