package Language_Coder;

import java.util.Scanner;

public class Main0147 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		int cnt = 1;
		sc.close();
		String res = "";

		for (int i = 0; i < iNum; i++) {
			for (int j = 0; j < i; j++) {
				res += "  ";
			}
			for (int j = iNum - i; j > 0; j--) {
				res += cnt + " ";
				cnt++;
			}
			res += "\n";
		}
		System.out.print(res);
	}

}

//�ڿ��� n�� �Է¹޾� "��� ��"�� ���� �������� �����Ͽ� ��µǴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����! ���ڴ� �������� �����ϵ� �ٻ��̿� ������ ����.
//
//3
//
//1 2 3
//  4 5
//    6