package language_coder;
import java.util.Scanner;

public class Main0533 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String G = sc.next();
		char g = G.charAt(0);
		int a = sc.nextInt();
		
		sc.close();
		
		String str = "";
		
		switch (g) {
		case 'M' : 
			if (a>=18) {
				str = "MAN";
			} else {
				str = "BOY";
			}
			break;
		case 'F' :
			if (a>=18) {
				str = "WOMAN";
			} else {
				str = "GIRL";
			}
			break;
			}
		System.out.print(str);
	}
}
