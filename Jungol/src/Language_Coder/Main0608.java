package Language_Coder;

import java.util.Scanner;

public class Main0608 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		if (input.contains("c")){
			System.out.print("Yes ");
		} else {
			System.out.print("No ");
		}
		
		if (input.contains("ab")){
			System.out.print("Yes");
		} else {
			System.out.print("No");
		}
		
		sc.close();
	}

}
