package language_coder;
import java.util.Scanner;

public class Main0564 {
	public static char A;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[26]; // ���ĺ� ���� ī����
		int[] abc = new int[26]; // ���ĺ� �迭
		for (int i = 0; i < ar.length; i++) {
			ar[i] = 0; // �迭�� ��� ���� 0���� �ʱ�ȭ.
			abc[i] = 65 + i; // �迭�� ��� ���� �ƽ�Ű �ڵ� ���ĺ� �빮�ڿ� �ش��ϴ� ������ �ʱ�ȭ.
		}

		while (true)

		{
			A = sc.next().charAt(0);
			// ���ĺ� �Է¹���.
			if ((int) A < 65 || (int) A > 90) {
				break;
			} // �Է¹޴� ���� ����. ����65 �̸�, ����90 �ʰ��� ���� �ԷµǸ� ���ѷ��� Ż��.

			for (int i = 0; i < ar.length; i++) {
				if ((int) A - 65 == i) {
					ar[i]++;
				}
			} // �Է¹��� ���� ������ ��ȯ, 65�� �����Ͽ� �迭�� �ε����� ��ġ�ϸ� �ε����� �� 1�� ����.
				// ar[1] = 0(B), B �Է¹���, B=66, 66-65 = 1, if (1 == ar[1]){ ar[1] = 1 }
		}

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != 0) {
				System.out.println((char) abc[i] + " : " + ar[i]);
			} // �迭������ ��� �� ��ĵ, ������ ���� 0�� �ƴҰ�쿡�� ���.
		}
		sc.close();
	}
}

//���� �빮�ڸ� �Է¹޴ٰ� �빮�� �̿��� ���ڰ� �ԷµǸ� �Է��� �ߴ��ϰ�
//
//���� �빮�ڵ鿡 ���Ͽ� 1�� �̻� �Էµ� �� ���ڿ� �� ������ ������ ���� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�ԷµǴ� ������ ������ 2�� �̻� 100�� �����̴�.
//A B C F F F B Z !
//A : 1
//B : 2
//C : 1
//F : 3
//Z : 1