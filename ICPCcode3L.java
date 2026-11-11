import java.util.*;
public class ICPCcode3L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int max = a[i];

                for (int j = i; j < n; j++) {

                    if (a[j] > max) {
                        max = a[j];
                    }
                    System.out.print(max + " ");
                }
            }
            System.out.println();
        }
    }
}
