package Language_Coder;
import java.util.Scanner;

public class Main0526 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //��ĳ�� ����
		double a = sc.nextDouble(); //�Ǽ� a �Է¹���
		double b = sc.nextDouble(); //�Ǽ� b �Է¹���
		sc.close(); //��ĳ�� ���
		
		double mtp = a*b; //�Ǽ� a��b�� ��
		int mtp2 = (int)mtp; //�Ǽ� a��b�� ���� ������ ��ȯ
	//	System.out.println(mtp);
		System.out.println(mtp2); //mtp2���

		int i = (int) a; //�Ǽ� a�� ������ ��ȯ
		int j = (int) b; //�Ǽ� b�� ������ ��ȯ

		System.out.print(i * j); //���� i�� j�� �� ���
	}

}
