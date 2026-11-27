import java.util.Scanner;
public class ICPCcode3E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = a[0];
        int position = 1;

        for (int i = 1; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
                position = i + 1;
            }
        }
        System.out.println(min + " " + position);
    }
}