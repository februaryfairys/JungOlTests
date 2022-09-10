package language_coder;
import java.util.Scanner;

public class Main0575 {

	public static void main(String[] args) {
		Involution inv = new Involution();
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double res = inv.involution(a, b);
		
		System.out.print((int)res);
		sc.close();
	}

}

class Involution {
	public double involution(int a, int b){
		double res = Math.pow(a, b);
		return res;
	}
}