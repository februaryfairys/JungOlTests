package Language_Coder;
import java.util.Scanner;

public class Main0154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] ar = new double[6];
		double sum = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextDouble();
			sum += ar[i];
//			System.out.println(ar[i]);
		}
//		System.out.println(sum);
		System.out.printf("%.1f", sum / ar.length);
		sc.close();
	}

}


//6���� �����Ը� �Է¹޾� �������� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����� �ݿø��Ͽ� �Ҽ� ù°�ڸ������� �Ѵ�.
//
//23.2 39.6 66.4 50.0 45.6 48.0
//
//45.5