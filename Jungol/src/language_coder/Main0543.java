package language_coder;
import java.util.Scanner;

public class Main0543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		for (int i = 1;i<=a/2;i++) {
			System.out.print(i*2+" ");
		}

	}

}
