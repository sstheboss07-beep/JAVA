import java.util.*;
public class ICPCcode3O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long a = 0;
        long b = 1;

        if (n == 1) {
            System.out.println(0);
        } 
        else if (n == 2) {
            System.out.println(1);
        } 
        else {
            for (int i = 3; i <= n; i++) {
                long c = a + b;
                a = b;
                b = c;
            }

            System.out.println(b);
        }
    }
}