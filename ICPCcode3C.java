/*import java.util.Scanner;
public class ICPCcode3C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            if (a > 0) {
                System.out.print("1 ");
            } else if (a < 0) {
                System.out.print("2 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}*/

import java.util.Scanner;
public class ICPCcode3C{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // Replace numbers
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                a[i] = 1;
            } else if (a[i] < 0) {
                a[i] = 2;
            }
        }
        // Print array
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
