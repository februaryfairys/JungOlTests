package Language_Coder;
import java.util.Scanner;

public class Main0586 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_0586 mn = new Main_0586();
		int iNum1 = sc.nextInt();
		int iNum2 = sc.nextInt();
		sc.close();

		int square = mn.square(iNum1, iNum2);
		int cube = mn.cube(iNum1, iNum2);

		System.out.printf("(%d - %d) ^ 2 = %d\n", iNum1, iNum2, square);
		System.out.printf("(%d + %d) ^ 3 = %d", iNum1, iNum2, cube);
	}
}

class Main_0586 {
	private double num1;
	private double num2;

	public int square(int iNum1, int iNum2) {
		num1 = (double) iNum1;
		num2 = (double) iNum2;
		double a = num1 - num2;
		int square = (int) Math.pow(a, 2);
		return square;
	}

	public int cube(int iNum1, int iNum2) {
		num1 = (double) iNum1;
		num2 = (double) iNum2;
		double a = num1 + num2;
		int cube = (int) Math.pow(a, 3);
		return cube;
	}
}