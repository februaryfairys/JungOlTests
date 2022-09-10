package language_coder;

import java.util.Arrays;
import java.util.Scanner;

public class Main0610 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] array = new String[5];
		
		for(int i = 0; i<array.length; i++){
			array[i] = sc.next();
		}
		
		Arrays.sort(array);
		
		for(int i = array.length-1; i>=0; i--){
			System.out.println(array[i]);
		}
		sc.close();
	}
}
