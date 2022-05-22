package Language_Coder;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main0188 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String iStr = sc.nextLine();
		sc.close();
		int i = 1;
		StringTokenizer st = new StringTokenizer(iStr, " ");

		while (st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(i + ". " + token);
			i++;
		}
	}
}
