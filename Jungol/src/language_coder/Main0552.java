package language_coder;
import java.util.Scanner;

public class Main0552 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int line = n;
		sc.close();
		
		for (int j = 0; j < line; j++) {
			for (int b = 0;b<j;b++){
				System.out.print(" ");}
			for (int i = (2 * line)-2*j; i > 1; i--) {
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
	}
}
//�ڿ��� n�� �Է¹޾Ƽ� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//3
//*****
// ***
//  *