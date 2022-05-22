package Language_Coder;
import java.util.Scanner;

public class Main0557 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] ca = new char[10];

		sc.close();
		
		for (int i = 0; i < ca.length; i++) {
			ca[i] = sc.next().charAt(0);
		
/*		int i = 0;
		while (i <= 7) {
			System.out.print(ca[i] + " ");
			i += 3; */ //½ÇÇàµÊ
		
/*		for (int i = 0; i < 7; i+=3) {
			System.out.print(ca[i] + " "); */ //½ÇÇàµÊ
		
/*		do {
			System.out.print(ca[i] + " ");
			
		} while (i <= 7);
		i += i+3; */ //½ÇÇà¾ÈµÊ
		}	
		
	}
}