package Language_Coder;
import java.util.Scanner;

public class Main0176 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double iNum1 = sc.nextDouble();
		double iNUm2 = sc.nextDouble();
		sc.close();

		double sr1 = Math.sqrt(iNum1);
		double sr2 = Math.sqrt(iNUm2);

		double larger = sr1 > sr2 ? sr1 : sr2;
		double smaller = sr1 < sr2 ? sr1 : sr2;

		int srInt1 = (int) larger;
		int srInt2 = (int) Math.ceil(smaller);
		int cnt = 0;
		for (int i = srInt2; i <= srInt1; i++) {
			cnt++;
		}
		System.out.print(cnt);
	}
}
