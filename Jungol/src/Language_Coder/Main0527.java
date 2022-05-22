package Language_Coder;
import java.util.Scanner;

public class Main0527 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(); //정수 a입력받음
		int b = sc.nextInt(); //정수 b입력받음
		
		
		double a2 = a; //a를 실수로 변환
		double dvd = a2/b; //실수a2를 b로 나눔
		System.out.print((a/b) + " "); //a를 b로 나눈 값 출력
		System.out.printf("%.2f",dvd); //실수a2를 b로 나눈 값 출력
		

	}

}
