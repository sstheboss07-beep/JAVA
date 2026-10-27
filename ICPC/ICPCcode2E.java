import java.util.Scanner;

public class ICPCcode2E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int max = 0; // Since Xi >= 0, we can initialize max to 0
            
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                if (x > max) {
                    max = x;
                }
            }
            
            System.out.println(max);
        }
    }
}
