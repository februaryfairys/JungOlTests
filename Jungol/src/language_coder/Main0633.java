package language_coder;

import java.util.Scanner;

public class Main0633 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1. Korea\n2. USA\n3. Japan\n4. China\nnumber? ");
			int a = sc.nextInt();

			if (a > 0 && a < 5) {
				switch (a) {
				case 1:
					System.out.println("\nSeoul\n");
					break;
				case 2:
					System.out.println("\nWashington\n");
					break;
				case 3:
					System.out.println("\nTokyo\n");
					break;
				case 4:
					System.out.println("\nBeijing\n");
					break;
				}
			} else {
				System.out.print("\nnone");
				break;
			}
		}
		sc.close();
	}
}
