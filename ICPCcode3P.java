import java.util.*;
public class ICPCcode3P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;

        while (true) {
            boolean even = true;

            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    even = false;
                    break;
                }
            }

            if (even == false) {
                break;
            }

            for (int i = 0; i < n; i++) {
                a[i] = a[i] / 2;
            }
            count++;
        }
        System.out.println(count);
    }
}
