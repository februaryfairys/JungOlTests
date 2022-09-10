package language_coder;
import java.util.Scanner;

public class Main0618 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_0618[] ar = new Main_0618[5];
		Main_0618 mn = new Main_0618();

		for (int i = 0; i < ar.length; i++) {
			String name = sc.next();
			double height = sc.nextDouble();
			double weight = sc.nextDouble();

			ar[i] = new Main_0618(name, height, weight);
		}
		sc.close();

		mn.sortByName(ar);
		mn.sortByweight(ar);
	}

}

class Main_0618 {
	private String name;
	private double height;
	private double weight;

	Main_0618() {
	}

	Main_0618(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public void sortByName(Main_0618[] ar) {
		String res = "name\n";
		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar.length; j++) {
				Main_0618 tmp;
				if (ar[i].name.charAt(0) < ar[j].name.charAt(0)) {
					tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			res += (ar[i].name + " ");
			res += ((int) ar[i].height + " ");
			res += (ar[i].weight + "\n");
		}
		print(res);
	}

	public void sortByweight(Main_0618[] ar) {
		String res = "weight\n";

		for (int i = 0; i < ar.length; i++) {

			for (int j = 0; j < ar.length; j++) {
				Main_0618 tmp;
				if (ar[i].weight > ar[j].weight) {
					tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}
		for (int i = 0; i < ar.length; i++) {
			res += (ar[i].name + " ");
			res += ((int) ar[i].height + " ");
			res += (ar[i].weight + "\n");
		}
		print(res);
	}

	public void print(String res) {
		System.out.println(res);
	}
}