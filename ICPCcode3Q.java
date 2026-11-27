import java.util.*;
public class ICPCcode3Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            long count = 0;
            int length = 1;

            for (int i = 1; i < n; i++) {
                if (a[i] >= a[i - 1]) {
                    length++;
                } else {
                    length = 1;
                }
                count += length;
            }
            System.out.println(count + 1);
        }
    }
}
