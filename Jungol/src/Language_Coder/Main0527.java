package Language_Coder;
import java.util.Scanner;

public class Main0527 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(); //���� a�Է¹���
		int b = sc.nextInt(); //���� b�Է¹���
		
		
		double a2 = a; //a�� �Ǽ��� ��ȯ
		double dvd = a2/b; //�Ǽ�a2�� b�� ����
		System.out.print((a/b) + " "); //a�� b�� ���� �� ���
		System.out.printf("%.2f",dvd); //�Ǽ�a2�� b�� ���� �� ���
		

	}

}
