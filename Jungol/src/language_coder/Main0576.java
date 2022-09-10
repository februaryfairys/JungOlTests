package language_coder;
import java.util.Scanner;

public class Main0576 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int iNum1 = sc.nextInt();
		String iOpr = sc.next();
		int iNum2 = sc.nextInt();
		
		sc.close();

		Opr opr = new Opr();

		opr.start(iNum1, iNum2, iOpr);
	}
}

class Opr {

	public void start(int a, int b, String o) {

		int result = opr(a, b, o);
		System.out.print(a + " " + o + " " + b + " = " + result);

	}

	public int opr(int a, int b, String o) {
		if (o.equals("+")) {
			return a + b;
		} else if (o.equals("-")) {
			return a - b;
		} else if (o.equals("*")) {
			return a * b;
		} else if (o.equals("/")) {
			return a / b;
		} else
			return 0;
//		switch (o) {
//		case "+":
//			return a + b;
//		case "-":
//			return a - b;
//		case "*":
//			return a * b;
//		case "/":
//			return a / b;
//		default:
//			return 0;
//		}
	}
}