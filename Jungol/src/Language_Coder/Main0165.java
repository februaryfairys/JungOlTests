package Language_Coder;

public class Main0165 {

	public static void main(String[] args) {
		int[][] ar = new int[5][5];
		ar[0][0] = 1;
		ar[0][2] = 1;
		ar[0][4] = 1;

		ar[1][1] = ar[0][0] + ar[0][2];
		ar[1][3] = ar[0][2] + ar[0][4];

		ar[2][0] = ar[1][1];
		ar[2][2] = ar[1][1] + ar[1][3];
		ar[2][4] = ar[1][3];

		ar[3][1] = ar[2][0] + ar[2][2];
		ar[3][3] = ar[2][2] + ar[2][4];

		ar[4][0] = ar[3][1];
		ar[4][2] = ar[3][1] + ar[3][3];
		ar[4][4] = ar[3][3];

//		for (int i = 1; i < 5; i++) {
//			if (i % 2 == 1) {
//				for (int j = 1; j < 5; j += 2) {
//					ar[i][j] = ar[i - 1][j - 1] + ar[i - 1][j + 1];
//				}
//			} else {
//				for (int j = 0; j < 5; j += 2) {
//
//					if (j == 0) {
//						ar[i][j] = ar[i - 1][j] + ar[i - 1][j + 1];
//					} else if (j == 4) {
//						ar[i][j] = ar[i - 1][j - 1] + ar[i - 1][j];
//					} else
//						ar[i][j] = ar[i - 1][j - 1] + ar[i - 1][j + 1];
//				}
//			}
//		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();
		}
	}

}
