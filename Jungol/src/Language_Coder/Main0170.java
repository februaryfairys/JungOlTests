package Language_Coder;

public class Main0170 {

	public static void main(String[] args) {
		Main_0170 mn = new Main_0170();
		int cnt = 1;
		String s = "first";

		for (int i = 0; i < 3; i++) {
			
			if (cnt == 2) {
				s = "second";
			} else if (cnt == 3) {
				s = "third";
			}
			
			System.out.println(s);
			mn.print();
			cnt++;
		}
	}

}

class Main_0170 {
	public void print() {
		System.out.println("@@@@@@@@@@");
	}
}