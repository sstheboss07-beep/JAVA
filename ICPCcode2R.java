import java.util.Scanner;
public class ICPCcode2R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n <= 0 || m <= 0) {
                break;
            }
            int sum = 0;
            if (n > m) {
                int temp = n;
                n = m;
                m = temp;
            }
            for (int i = n; i <= m; i++) {
                System.out.print(i + " ");
                sum += i;
            }
            System.out.println("sum =" + sum);
        }
    }
}