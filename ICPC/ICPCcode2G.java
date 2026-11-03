import java.util.Scanner;

public class ICPCcode2G {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Check if there is an input for the number of test cases T
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        // Process each test case
        while (t-- > 0) {
            int n = sc.nextInt();
            long factorial = 1; // Use long because 20! exceeds the maximum limit of a standard int
            
            // Calculate the factorial from 1 up to n
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            // Print the result for the current test case
            System.out.println(factorial);
        }
        
        sc.close();
    }
}