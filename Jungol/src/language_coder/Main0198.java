package language_coder;
import java.util.Scanner;

public class Main0198 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Main_0198[] parents = new Main_0198[2];

		for (int i = 0; i < parents.length; i++) {
			double height = sc.nextDouble();
			double weight = sc.nextDouble();
			parents[i] = new Main_0198(height, weight);
		}
		sc.close();
		Main_0198.res(parents);
	}
}

class Main_0198 {
	private double height;
	private double weight;

	Main_0198(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	public static void res(Main_0198[] parents) {
		double heiOfSon = 5;
		double weiOfSon = -4.5;
		for (int i = 0; i < parents.length; i++) {
			heiOfSon += parents[i].height / 2;
			weiOfSon += parents[i].weight / 2;
		}

		System.out.printf("height : %.0fcm\n", Math.floor(heiOfSon));
		System.out.printf("weight : %.1fkg", weiOfSon);

	}

}