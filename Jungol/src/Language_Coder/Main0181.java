package Language_Coder;
import java.util.Scanner;

public class Main0181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("radius : ");
		
		double iRad = sc.nextDouble();
		double pi = 3.141592;
		double area = pi * iRad * iRad;

		sc.close();
		System.out.printf("area = %.3f", area);
	}
}
