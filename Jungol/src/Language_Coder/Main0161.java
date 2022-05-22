package Language_Coder;
import java.util.Scanner;

public class Main0161 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[100];
		int[] ar2 = new int[11];
		for (int i = 0; i < ar.length; i++) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			ar[i] = n / 10;
			if (ar[i] == 0) {
				ar2[0]++;
			}
			

		}

		sc.close();

		for (int j : ar) {
			switch (j) {

			case 1: {
				ar2[1]++;
				break;
			}
			case 2: {
				ar2[2]++;
				break;
			}
			case 3: {
				ar2[3]++;
				break;
			}
			case 4: {
				ar2[4]++;
				break;
			}
			case 5: {
				ar2[5]++;
				break;
			}
			case 6: {
				ar2[6]++;
				break;
			}
			case 7: {
				ar2[7]++;
				break;
			}
			case 8: {
				ar2[8]++;
				break;
			}
			case 9: {
				ar2[9]++;
				break;
			}
			case 10: {
				ar2[10]++;
				break;
			}
			}
		}

		for (int l = 10; l >= 0; l--) {
			if (ar2[l] != 0) {
				System.out.println((l * 10) + " : " + ar2[l] + " person");
			}
		}
	}

}
