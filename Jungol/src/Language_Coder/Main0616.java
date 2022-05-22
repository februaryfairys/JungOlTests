package Language_Coder;
import java.util.Scanner;

public class Main0616 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangle TA = new Triangle();
		int[] angle = new int[6];
		for (int i = 0; i < angle.length; i++) {
			angle[i] = sc.nextInt();
		}
		sc.close();
		TA.triangle(angle);
	}
}

class Triangle{
	
	public void triangle(int[] angle) {

		int centerOfMass1 = 0;
		int centerOfMass2 = 0;

		for (int j = 0; j < angle.length; j += 2) {
			centerOfMass1 += angle[j];		//배열 0,2,4번 인덱스
			centerOfMass2 += angle[j + 1];	//배열 1,3,5번 인덱스
		}
		print(centerOfMass1, centerOfMass2);

	}

	public void print(int i, int j) {
		
		System.out.printf("(%.1f, %.1f)", (double) i / 3, (double) j / 3);
	}
}
