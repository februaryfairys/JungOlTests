package Language_Coder;
import java.util.Scanner;

public class Main0120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();

		int x = (i > j) ? i : j; /* ū�� */
		int y = (j > i) ? i : j; /* ������ */
		int z = x - y;

/*		System.out.println(i);
		System.out.println(j);
		System.out.println(x); /* ū����� */
//		System.out.println(y); /* ��������� */ 
		System.out.print(z);
	}

}
