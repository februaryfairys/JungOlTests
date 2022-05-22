package Language_Coder;
import java.util.Scanner;

public class Main0523 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();

	/*	boolean a = (i > j);
		boolean b = (i < j);
		boolean c = (i >= j);
		boolean d = (i <= j); */
		
	//	boolean e = (i>j) ? true : false;
	//	boolean f = (i>=j) ? true : false;
		
	//	System.out.println(i + " > " + j + " --- " + a);
	//	System.out.println(i + " < " + j + " --- " + b);
		//System.out.println(i + " >= " + j + " --- " + c);
	//	System.out.println(i + " <= " + j + " --- " + d);
		
	//	System.out.println(i + " > " + j + " --- " + e);
	//	System.out.println(i + " >= " + j + " --- " + f);
		
		System.out.println(i + " > " + j + " --- " + ((i>j) ? true : false));
		System.out.println(i + " < " + j + " --- " + ((i<j) ? true : false));
		System.out.println(i + " >= " + j + " --- " + ((i>=j) ? true : false));
		System.out.println(i + " <= " + j + " --- " + ((i<=j) ? true : false));
	}

}
