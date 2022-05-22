package Language_Coder;
import java.util.Scanner;

public class Main0550 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		reverseRun(n);
		run(n);

		sc.close();
	}

	public static void reverseRun(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void run(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
//자연수 n을 입력받아서 다음과 같이 출력하는 프로그램을 작성하시오.
//***
//**
//*
//*
//**
//***