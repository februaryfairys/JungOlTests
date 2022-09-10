package language_coder;

import java.util.Scanner;

public class Main0612 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i<5;i++){
			sb.append(sc.next());
		}
		
		System.out.println(sb);
//		System.out.println(sb.substring(0,3));
		sc.close();
	}
}
