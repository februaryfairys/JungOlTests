package Language_Coder;
import java.util.Scanner;

public class Main0582 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double iCircleArea = sc.nextDouble();
		sc.close();
		
		double res = Math.sqrt(iCircleArea / 3.14);

		System.out.printf("%.2f", res);
	}

}