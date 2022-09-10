package language_coder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main0594 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = br.readLine();
		sc.close();
		System.out.println(A + A);
		System.out.print(B + B);
	}

}
