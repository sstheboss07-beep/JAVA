import java.util.Scanner;
public class ICPCcode3I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    int result = a[i] + a[j] + j - i;

                    if (result < min) {
                        min = result;
                    }
                }
            }
            System.out.println(min);
        }
    }
}
