package Language_Coder;

import java.util.Scanner;

public class Main0147 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		int cnt = 1;
		sc.close();
		String res = "";

		for (int i = 0; i < iNum; i++) {
			for (int j = 0; j < i; j++) {
				res += "  ";
			}
			for (int j = iNum - i; j > 0; j--) {
				res += cnt + " ";
				cnt++;
			}
			res += "\n";
		}
		System.out.print(res);
	}

}

//자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
//
//주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
//
//3
//
//1 2 3
//  4 5
//    6