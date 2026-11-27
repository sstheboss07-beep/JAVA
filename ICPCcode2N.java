
import java.util.Scanner;

public class ICPCcode2N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char s = sc.next().charAt(0);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            for (int j = 0; j < x; j++) {
                System.out.print(s);
            }

            System.out.println();
        }

        sc.close();
    }
}
