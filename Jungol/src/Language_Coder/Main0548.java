package Language_Coder;

public class Main0548 {

	public static void main(String[] args) {
		for (int a = 2; a <= 4; a++) {
			for (int b = 1; b <= 5; b++) {
				// System.out.print(b + " * " + a + " = " + (b*a)+ " ");
				System.out.printf("%d * %d = %2d   ", a, b, (a * b));
			}
			System.out.println();
		}

	}

}

//구구단의 일부를 다음과 같이 출력하는 프로그램을 작성하시오.
//
//곱셈의 결과는 오른쪽으로 맞추어 출력을 하고 결과값 사이의 공백은 3칸으로 한다.
//
//출력형식 예) 2_*_1_=__2___ (_는 공백을 나타내는 것임)​