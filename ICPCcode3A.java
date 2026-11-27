import java.util.Scanner;
public class ICPCcode3A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long sum = 0;

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            sum = sum + num;
        }
        System.out.println(Math.abs(sum));
    }
}
