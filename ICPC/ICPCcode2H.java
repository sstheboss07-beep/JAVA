import java.util.*;
public class ICPCcode2H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the input number X
        int x = sc.nextInt();
      // Assume the number is prime first
        boolean prime = true;

        // Check if any number from 2 up to x-1 can divide x
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                prime = false; // Found a divisor, so it's not prime
                break;        // Exit the loop early
            }
        }

        // Print YES or NO
        if (prime) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}