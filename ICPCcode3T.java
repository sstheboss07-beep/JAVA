import java.util.*;
public class ICPCcode3T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] a = new int[n][n];

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();

                if (i == j) {
                    sum1 += a[i][j];
                }

                if (i + j == n - 1) {
                    sum2 += a[i][j];
                }
            }
        }

        System.out.println(Math.abs(sum1 - sum2));
    }
}