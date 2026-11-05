import java.util.Scanner;
public class ICPCcode2Z {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        for (int a = 0; a <= m; a++) {
            for (int b = 0; b <= m; b++) {
                for (int c = 0; c <= m; c++) {

                    if (a + b + c == n) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
