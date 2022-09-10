package language_coder;
import java.util.Scanner;

public class Main0186 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String iStr1 = sc.next();
		String iStr2 = sc.next();
		sc.close();

		int strLength1 = iStr1.length();
		int strLength2 = iStr2.length();
		
		int res = Math.max(strLength1, strLength2);
		
		System.out.print(res);
	}
}
