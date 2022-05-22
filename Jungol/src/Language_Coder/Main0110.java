package Language_Coder;
import java.util.Scanner;

public class Main0110 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double yd = 91.44;
		double a = sc.nextDouble();

		sc.close();

		System.out.print("yard? ");
		
		System.out.printf("%.1fyard = %.1fcm", a, (a * yd));

	}

}
