package Language_Coder;
import java.util.Scanner;

public class Main0171 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		sc.close();
		
		if (iNum > 1000) {
			System.out.println("1000 이하의 수를 입력하세요.");
		} else if (iNum < 0) {
			System.out.println("0 이상의 수를 입력하세요.");
		} else {
			Main_0171 mn = new Main_0171();
			mn.sum(iNum);
		}
	}

}

class Main_0171 {
	public void sum(int iNum) {
		int sum = 0;
		for (int i = 1; i <= iNum; i++) {
			sum += i;
		}
		System.out.print(sum);
	}
}