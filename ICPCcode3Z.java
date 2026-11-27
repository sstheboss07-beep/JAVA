import java.util.*;
public class ICPCcode3Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        while (q-- > 0) {
            int x = sc.nextInt();

            int l = 0;
            int r = n - 1;
            boolean found = false;

            while (l <= r) {
                int mid = (l + r) / 2;

                if (a[mid] == x) {
                    found = true;
                    break;
                }
                else if (a[mid] < x) {
                    l = mid + 1;
                }
                else {
                    r = mid - 1;
                }
            }

            if (found) {
                System.out.println("found");
            } else {
                System.out.println("not found");
            }
        }
    }
}
