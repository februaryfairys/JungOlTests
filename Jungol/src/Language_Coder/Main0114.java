package Language_Coder;
import java.util.Scanner;

public class Main0114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();
		
	//	i = ++i;
	
		
		System.out.println(++i + " " + j--);
		System.out.println(i + " " + j);

	}

}
