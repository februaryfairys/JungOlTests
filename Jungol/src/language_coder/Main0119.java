package language_coder;

public class Main0119 {

	public static void main(String[] args) {

		java.util.Calendar cal = java.util.Calendar.getInstance();

		int a = 0;
		a = cal.get(java.util.Calendar.YEAR) - 1900; // ---��

		a += cal.get(java.util.Calendar.MONTH); // ---��

		a += cal.get(java.util.Calendar.DATE);

		System.out.printf("%d %d %d ", 0, 122, 143); // ---�� //�� �� �鿡���� a���� 1, 2, 3�ڸ��� ���� �� �ִ´�.

	}

}