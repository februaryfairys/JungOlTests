package language_coder;
import java.util.Scanner;

public class Main0130 {
	static int a;
	static Main0130 mn = new Main0130();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		mn.loop();
		sc.close();
	}

	public void loop() {
		for (int i = 0; i < a; i++) {
			mn.print();
		}
	}

	public void print() {
		System.out.println("JUNGOL");
	}
}
