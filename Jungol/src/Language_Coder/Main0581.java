package Language_Coder;
import java.util.Scanner;

public class Main0581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_0581 mn = new Main_0581();
		int iInt1 = sc.nextInt();
		int iInt2 = sc.nextInt();
		double iDouble1 = sc.nextDouble();
		double iDouble2 = sc.nextDouble();
		sc.close();

		int largerInt = mn.largerInt(iInt1, iInt2);
		double smallerDouble = mn.smallerDouble(iDouble1, iDouble2);

		System.out.printf("%d \n",largerInt);
		System.out.printf("%.2f", smallerDouble);

	}
}

class Main_0581 {
	private int int1;
	private int int2;
	private double double1;
	private double double2;

	public int largerInt(int iInt1, int iInt2) {
		int1 = iInt1;
		int2 = iInt2;

		int intAbs1 = Math.abs(int1);
		int intAbs2 = Math.abs(int2);

		int intRes = intAbs1 > intAbs2 ? int1 : int2;

		return intRes;
	}

	public double smallerDouble(double iDouble1, double iDouble2) {
		double1 = iDouble1;
		double2 = iDouble2;

		double doubleAbs1 = Math.abs(double1);
		double doubleAbs2 = Math.abs(double2);

		double doubleRes = doubleAbs1 < doubleAbs2 ? double1 : double2;

		return doubleRes;
	}
}
