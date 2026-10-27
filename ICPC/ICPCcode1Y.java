import java.util.Scanner;
public class ICPCcode1Y {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long num = ((a % 100) * (b % 100) % 100
                  * (c % 100) % 100
                  * (d % 100)) % 100;

        System.out.printf("%02d%n", num);
    }
}