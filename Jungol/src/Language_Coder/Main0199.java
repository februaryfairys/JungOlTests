package Language_Coder;
import java.util.Scanner;

public class Main0199 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Main_0199[] ar = new Main_0199[n];
		Main_0199[] tmp = new Main_0199[1];

		for (int i = 0; i < ar.length; i++) {
			String name = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = a + b + c;
			Main_0199 p = new Main_0199(name, a, b, c, d);
			ar[i] = p;
		}
		sc.close();

		for (int j = 0; j < n; j++) {
			for (int k = j + 1; k < n; k++) {

				if (ar[j].d < ar[k].d) {
					tmp[0] = ar[j];
					ar[j] = ar[k];
					ar[k] = tmp[0];
				}
			}
		}
		for (int l = 0; l < ar.length; l++) {
			ar[l].print();
		}
	}
}

class Main_0199 {
	String name;
	int a, b, c, d;

	public Main_0199(String name, int a, int b, int c, int d) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public void print() {
		System.out.println(name + " " + a + " " + b + " " + c + " " + d);
	};

}
