package Language_Coder;
import java.util.Scanner;

public class Main0138 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		for (int j = 1; j <= a; j++) {
			for (int i = 1; i <= a; i++) {
				System.out.print("(" + j + ", " + i + ")" + " ");
			}
			System.out.println();
		}
	}

}

//정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램을 작성하시오.
//
//
//
//* 주의 
//
// ')'와 '('사이에 공백이 1칸 있다.
//(1,_1) 처럼 출력한다 : '_'는 공백
//
//4
//
//(1, 1) (1, 2) (1, 3) (1, 4)
//(2, 1) (2, 2) (2, 3) (2, 4)
//(3, 1) (3, 2) (3, 3) (3, 4)
//(4, 1) (4, 2) (4, 3) (4, 4)