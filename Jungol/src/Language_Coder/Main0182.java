package Language_Coder;
import java.util.Scanner;

public class Main0182 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String iStr1 = sc.next();
		String iStr2 = sc.next();
		sc.close();

		char char1 = iStr1.charAt(0);
		char char2 = iStr2.charAt(0);

		int res1 = char1 + char2;
		int res2 = char1 > char2 ? (char1 - char2) : (char2 - char1);
		System.out.print(res1 + " " + res2);
		
	}
}
