import java.util.*;
public class ICPCcode3X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] a = new char[n][m];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                a[i][j] = s.charAt(j);
            }
        }

        int r = sc.nextInt() - 1;
        int c = sc.nextInt() - 1;

        boolean ans = true;

        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {

                if (i >= 0 && i < n && j >= 0 && j < m) {

                    if (i == r && j == c) {
                        continue;
                    }

                    if (a[i][j] != 'x') {
                        ans = false;
                    }
                }
            }
        }

        if (ans) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
