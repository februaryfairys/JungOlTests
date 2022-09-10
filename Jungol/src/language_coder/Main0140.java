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
//정수 20 개를 입력받아서 그 합과 평균을 출력하되 0 이 입력되면 20개 입력이 끝나지 않았더라도 그 때까지 입력된 합과 평균을 출력하는 프로그램을 작성하시오.
//
//평균은 소수부분은 버리고 정수만 출력한다.(0이 입력된 경우 0을 제외한 합과 평균을 구한다.)
//
//5 9 6 8 4 3 0
//
//35 5
