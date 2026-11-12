import java.util.*;
public class ICPCcode3M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = 0;
        int max = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] < a[min]) {
                min = i;
            }

            if (a[i] > a[max]) {
                max = i;
            }
        }

        int temp = a[min];
        a[min] = a[max];
        a[max] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
