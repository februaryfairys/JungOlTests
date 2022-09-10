package language_coder;
import java.util.Scanner;

public class Main0534 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);

		sc.close();
		
		switch (a) {
		case 'A':
			System.out.print("Excellent");
			break;
		case 'B':
			System.out.print("Good");
			break;
		case 'C':
			System.out.print("Usually");
			break;
		case 'D':
			System.out.print("Effort");
			break;
		case 'F':
			System.out.print("Failure");
			break;
		default:
			System.out.print("error");
		}

	//	if (a != 'A' && a != 'B' && a != 'C' && a != 'D' && a != 'F') {
		//	System.out.print("error");
		}

	}

