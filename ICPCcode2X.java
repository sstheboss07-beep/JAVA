import java.util.Scanner;

public class ICPCcode2X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int count = 0;

            while (n > 0) {
                if (n % 2 == 1) {
                    count++;
                }
                n = n / 2;
            }

            int result = 0;

            for (int i = 0; i < count; i++) {
                result = result * 2 + 1;
            }

            System.out.println(result);
        }
    }
}

