package language_coder;
import java.util.Arrays;
import java.util.Scanner;

public class Main0583 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_0583 mn = new Main_0583();
		double[] ar = new double[3];

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextDouble();
		}
		sc.close();
		mn.print(ar);
	}
}

class Main_0583 {

	private double minDouble;
	private double midDouble;
	private double maxDouble;

	public void print(double[] ar) {
		Arrays.sort(ar);

		minDouble = ar[0];
		midDouble = ar[1];
		maxDouble = ar[2];

		int max = (int) (ceil(maxDouble));
		int mid = (int) (round(midDouble));
		int min = (int) (floor(minDouble));
		
		System.out.print(max + " " + min + " " + mid);
	}

	public double ceil(double maxDouble) {
		return Math.ceil(maxDouble);
	}

	public double floor(double minDouble) {
		return Math.floor(minDouble);
	}

	public double round(double midDouble) {
		return Math.round(midDouble);
	}
}
