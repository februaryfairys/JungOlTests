package language_coder;
import java.util.Scanner;

public class Main0179 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_0179 mn = new Main_0179();
		double[] dbAr = new double[3];

		for (int i = 0; i < dbAr.length; i++) {
			dbAr[i] = sc.nextDouble();
		}
		sc.close();
		int res1 = mn.res1(dbAr);
		int res2 = mn.res2(dbAr);

		System.out.println(res1);
		System.out.println(res2);
	}
}

class Main_0179 {

	public int res1(double[] ar) {
		int res1;
		double sum = 0;
		double avg = 0;
		
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
			avg = sum / ar.length;
		}
		
		res1 = (int) Math.round(avg);
		return res1;
	}

	public int res2(double[] ar) {
		int res2;
		double sum = 0;
		double avg = 0;
		
		for (int i = 0; i < ar.length; i++) {
			sum += Math.round(ar[i]);
			avg = sum / ar.length;
		}
		
		res2 = (int) Math.round(avg);
		return res2;
	}
}