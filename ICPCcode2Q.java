import java.util.Scanner;
public class ICPCcode2Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (n == 0) {
                System.out.println(0);
            } else {
                while (n > 0) {
                    System.out.print((n % 10) + " ");
                    n = n / 10;
                }
                System.out.println();
            }
        }
    }
}

