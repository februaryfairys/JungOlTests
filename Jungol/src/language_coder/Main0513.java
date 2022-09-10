package language_coder;
public class Main0513 {
	public static void main(String[] args) {

		double yd = 2.1;
		double in = 10.5;

		double YD = yd * 91.44;
		double IN = in * 2.54;

		System.out.printf("%4.1fyd = %5.1fcm\n", yd, YD);
		System.out.printf("%4.1fin = %5.1fcm", in, IN);

	}
}
