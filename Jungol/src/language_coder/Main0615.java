package language_coder;
import java.util.Scanner;

public class Main0615 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Std[] p = new Std[2];

		for (int i = 0; i < p.length; i++) {
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();

			p[i] = new Std(name, kor, eng);
		}
		sc.close();

		for (int i = 0; i < p.length; i++) {
			p[i].prt();
		}
		int sumKor = 0, sumEng = 0;
		for (int i = 0; i< p.length; i++) {
			sumKor += p[i].getKor();
			sumEng += p[i].getEng();
		}
		System.out.println("avg " + (sumKor/p.length) + " " + (sumEng/p.length));
	}
}
		
		
	


class Std {
	private String name;
	private int kor;
	private int eng;

	public Std(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	public void prt() {
		System.out.println(name + " " + kor + " " + eng);
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
}