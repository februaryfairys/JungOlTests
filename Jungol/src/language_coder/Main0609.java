package language_coder;

import java.util.Arrays;
import java.util.Scanner;

public class Main0609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = new String[3];
		
		for(int i = 0; i<3; i++){
			array[i] = sc.next();
		}
		Arrays.sort(array);
		
		System.out.println(array[0]);
		sc.close();
	}

}
