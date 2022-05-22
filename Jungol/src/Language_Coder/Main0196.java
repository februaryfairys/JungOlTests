package Language_Coder;
import java.util.Scanner;

public class Main0196 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3];
		String[] tel = new String[3];
		String[] address = new String[3];
		char[] c = new char[3];

		for (int i = 0; i < 3; i++) {
			name[i] = sc.next();
			tel[i] = sc.next();
			address[i] = sc.next();
			c[i] = name[i].charAt(0);
		}
		sc.close();
		
		Person3 p0 = new Person3(name[0], tel[0], address[0]);
		Person3 p1 = new Person3(name[1], tel[1], address[1]);
		Person3 p2 = new Person3(name[2], tel[2], address[2]);

		if (c[0] < c[1]) {
			if (c[0] < c[2]) {
				p0.print();
			} else
				p2.print();
		} else {
			if (c[1] < c[2]) {
				p1.print();
			} else
				p2.print();
		}

	}

}

class Person3 {
	private String name, tel, address;

	Person3(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;

	}

	public void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("addr : " + address);
	}
}