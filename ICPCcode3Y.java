import java.util.*;
public class ICPCcode3Y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] prefix = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            prefix[i] = prefix[i - 1] + x;
        }

        StringBuilder sb = new StringBuilder();

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            long sum = prefix[r] - prefix[l - 1];

            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
