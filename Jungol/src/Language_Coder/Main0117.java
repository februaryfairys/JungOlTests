package Language_Coder;
import java.util.Scanner;

public class Main0117 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] ar = new double[3];
		
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextDouble();
			sum = sum + (int)ar[i];
			avg = (avg + ar[i]);
		}
		
		double avg2 = avg / ar.length; 
		System.out.println("sum " + (int)sum);
		System.out.println("avg " + (int)avg2);
		sc.close();
	}

}
