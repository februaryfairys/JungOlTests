package Language_Coder;
import java.util.Scanner;

public class Main0180 {
	final static int sevenNumbers = 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[sevenNumbers];

		for (int i = 0; i < sevenNumbers; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < sevenNumbers-1; j++) {
				int tmp;
				if (ar[j] > ar[j+1]) {
					tmp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = tmp;
				}
			}
		}
		for(int i = 0; i<sevenNumbers; i++){
			System.out.print(ar[i] + " ");
		}
	}
}
