package begginer_coder;
import java.util.Scanner;

public class Main1338 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = 0;
		sc.close();

		for (int i = 1; i <= n; i++) {// ��ġ����
			for (int b = (n - 1); b >= i; b--) {
				System.out.print("  ");

			}
			for (int j = 1; j <= i; j++) {
				if (num >= 26) {
					num = (num % 26);

				}
				System.out.print((char)(num + 65)+ " ");
				num += n - j;
			}
			num = i;
			System.out.println();

		}
	}
}
//�־��� ���´�� ���̰� N�� ���ڻﰢ���� ����Ѵ�. ���� ���̴� �� ���� �������� �����Ѵ�.
//        A 
//      B F 
//    C G J 
//  D H K M 
//E I L N O 