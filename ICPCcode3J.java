import java.util.Scanner;
public class ICPCcode3J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] < min) {
                min = a[i];
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == min) {
                count++;
            }
        }

        if (count % 2 != 0) {
            System.out.println("Lucky");
        } else {
            System.out.println("Unlucky");
        }
    }
}