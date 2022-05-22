package Language_Coder;
import java.util.Scanner;

public class Main0537 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();

//		System.out.println(in);

		int sum = 0;
	/*	for (int i = 1; i <= in; i++) {
			sum = sum + i;
		} */
		
	int i =1;
		while(i <=in) {
			sum+=i;
			i = i+1; 
		} 
		
	/*	int i =1;
		do {
			sum += i++;
		} while (i <= in);
		} */
		
		System.out.print(sum); 
		
		
	}
}
