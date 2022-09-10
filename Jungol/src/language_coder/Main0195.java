package language_coder;
import java.util.Scanner;

class Address {
	private String name;
	private String tel;
	private String address;

	public Address(String name, String tel, String address) {
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

public class Main0195 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String address = sc.next();
		sc.close();

		Address A = new Address(name, tel, address);
		A.print();
	}

}
