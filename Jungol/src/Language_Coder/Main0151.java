package Language_Coder;
import java.util.Scanner;

public class Main0151 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ar[] = new int[5];
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
//			System.out.print(ar[i]+" ");
		}
		for (int i = 0; i < ar.length; i += 2) {
			
			sum += ar[i];
		}
		System.out.print(sum);
		sc.close();
	}

}
