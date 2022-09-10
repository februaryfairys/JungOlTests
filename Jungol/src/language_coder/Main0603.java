package language_coder;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main0603 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String iStr = sc.nextLine();
		String res = "";
		sc.close();

		StringTokenizer st = new StringTokenizer(iStr, " ");
		int ct = st.countTokens();
		String[] ar = new String[ct];

		for (int i = 0; i < ct; i++) {
			ar[i] = st.nextToken();
		}

		for (int i = 0; i < ar.length; i += 2) {
			res += ar[i] + "\n";
		}
		System.out.println(res);
	}
}
