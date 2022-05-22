package Language_Coder;
import java.util.Scanner;

public class Main0529 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		
		sc.close();
		
		int o = (w + 100 - h);
		
		System.out.println(o);
		
		if (o > 0) {
			System.out.print("Obesity");
		}
	}
}
