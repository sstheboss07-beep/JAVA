import java.util.Scanner;

public class ICPCcode2M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
        int b = sc.nextInt();

        boolean found = false;

        for (int i = a; i <= b; i++) {
            int n = i;
            boolean lucky = true;

            while (n > 0) {
                int digit = n % 10;

                if (digit != 4 && digit != 7) {
                    lucky = false;
                    break;
                }

                n = n / 10;
            }

            if (lucky) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println(-1);
        }

    }
}
