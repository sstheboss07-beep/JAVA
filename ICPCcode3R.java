import java.util.*;
public class ICPCcode3R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
