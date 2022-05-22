package Language_Coder;
import java.util.Scanner;

public class Main0526 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //스캐너 선언
		double a = sc.nextDouble(); //실수 a 입력받음
		double b = sc.nextDouble(); //실수 b 입력받음
		sc.close(); //스캐너 폐쇄
		
		double mtp = a*b; //실수 a와b의 곱
		int mtp2 = (int)mtp; //실수 a와b의 곱을 정수로 변환
	//	System.out.println(mtp);
		System.out.println(mtp2); //mtp2출력

		int i = (int) a; //실수 a를 정수로 변환
		int j = (int) b; //실수 b를 정수로 변환

		System.out.print(i * j); //정수 i와 j의 곱 출력
	}

}
