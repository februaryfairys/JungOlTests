package language_coder;
import java.util.Scanner;
 
public class Main0140 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[20];
        int sum = 0;
        int cnt = 0;
 
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
            if (ar[i] != 0) {
                sum = sum + ar[i];
                cnt++;
            }
 
            if (ar[i] == 0) {
                break;
            }
        }
        System.out.print(sum + " " + sum / cnt);
        sc.close();
    }
}
//���� 20 ���� �Է¹޾Ƽ� �� �հ� ����� ����ϵ� 0 �� �ԷµǸ� 20�� �Է��� ������ �ʾҴ��� �� ������ �Էµ� �հ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//����� �Ҽ��κ��� ������ ������ ����Ѵ�.(0�� �Էµ� ��� 0�� ������ �հ� ����� ���Ѵ�.)
//
//5 9 6 8 4 3 0
//
//35 5
