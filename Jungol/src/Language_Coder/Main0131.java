package Language_Coder;
import java.util.Scanner;

public class Main0131 {
	static int a;
	static int b;

	public void loop() {
		if (a >= b) {
			for (int i = b; i <= a; i++) {

				System.out.print(b++ + " ");
			}

		} else if (a <= b)
			for (int i = a; i <= b; i++) {
				System.out.print(a++ + " ");
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		Main0131 mn = new Main0131();
		mn.loop();
	}

}
