package language_coder;
import java.util.Scanner;

public class Main0597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String iStr1 = sc.next();
		String iStr2 = sc.next();
		
		sc.close();
		
		int str1Length = iStr1.length();
		int str2Length = iStr2.length();
		int res = str1Length + str2Length;
		
		System.out.print(res);
	}

}
