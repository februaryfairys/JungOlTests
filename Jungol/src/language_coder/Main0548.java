package language_coder;

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

//구구?��?�� ?���?�? ?��?���? 같이 출력?��?�� ?��로그?��?�� ?��?��?��?��?��.
//
//곱셈?�� 결과?�� ?��른쪽?���? 맞추?�� 출력?�� ?���? 결과�? ?��?��?�� 공백?? 3칸으�? ?��?��.
//
//출력?��?�� ?��) 2_*_1_=__2___ (_?�� 공백?�� ?��???��?�� 것임)??