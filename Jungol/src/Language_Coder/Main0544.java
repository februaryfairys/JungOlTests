package Language_Coder;
import java.util.Scanner;

public class Main0544 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		sc.close();
		
		for (int i = a ;i<=100;i++) {
			sum = sum + a++;
			 
		} System.out.println(sum);
	}

}
