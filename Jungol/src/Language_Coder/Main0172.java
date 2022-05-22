package Language_Coder;
import java.util.Scanner;

public class Main0172 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_0172 mn = new Main_0172();
		int iNum = sc.nextInt();

		sc.close();

		mn.main_0172(iNum);
	}
}

class Main_0172 {
	public void main_0172(int iNum) {
	
		if (iNum > 100) {
			System.out.print("100 이하의 자연수를 입력하세요.");
		} else if (iNum < 1) {
			System.out.print("1 이상의 자연수를 입력하세요.");
		} else {
			for (int i = 1; i <= iNum; i++) {
				for (int j = 1; j <= iNum; j ++) {
					System.out.print(j*i + " ");
				}
			System.out.println();
			}
		}
	}
}