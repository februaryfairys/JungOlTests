package language_coder;

import java.util.Scanner;

public class Main0580 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main_0580 mn = new Main_0580();

		int iMonth = sc.nextInt();
		int iDate = sc.nextInt();
		sc.close();
		mn.input(iMonth, iDate);

	}
}

class Main_0580 {
	private int month;
	private int date;
	private boolean m = true;
	private boolean d = true;

	public void input(int month, int date) {
		this.month = month;
		this.date = date;
		result();
	}

	public void result() {
		if (month < 1 || month > 12) {
			m = false;
		}

		if (month == 2) {
			if (date < 1 || date > 29) {
				d = false;
			}
		}
		if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (date < 1 || date > 30) {
				d = false;
			}
		} else {
			if (date < 1 || date > 31) {
				d = false;
			}
		}
		print(m, d);
	}

	public void print(boolean m, boolean d) {
		if (m == true && d == true) {
			System.out.print("OK!");
		} else
			System.out.print("BAD!");
	}
}