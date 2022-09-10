package language_coder;

import java.util.Scanner;

public class Main0159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] ar = new int[N];
		for (int i = 0; i < N; i++) {
			ar[i] = sc.nextInt();
		}
		int temp;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
			if(ar[i] <= ar[j]){
				temp = ar[i];
				ar[i] = ar[j];
				ar[j]= temp;}
			}
		
			System.out.println(ar[i]);
			sc.close();
		}

	}
}
