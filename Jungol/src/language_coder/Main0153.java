package language_coder;
import java.util.Scanner;

public class Main0153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		int i;
		for (i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] == -1) {
				sc.close();
				break;

			}

		}
		if (i > 2) {
			for (int j = i - 3; j < i; j++) {
				System.out.print(ar[j] + " ");
			}
		} else
			for (int j = 0; j < i; j++) {
				System.out.print(ar[j] + " ");
			}
	}
}
//100���� ������ �Է¹��� �� �ִ� �迭�� ������ �� ������ ���ʷ� �Է� �޴ٰ� 
//-1�� �ԷµǸ� �Է��� �ߴ��ϰ� -1�� ������ ������ �� ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
//(�Է¹��� ������ -1�� �����ϰ� 3�� �̸��� ��쿡�� -1�� �����ϰ� �Է¹��� ������ ��� ����Ѵ�.)
//
//30 20 10 60 80 -1
//
//10 60 80