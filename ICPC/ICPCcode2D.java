import java.util.Scanner;

public class ICPCcode2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x == 1999) {
                System.out.println("Correct");
                break; // Terminate the program once the correct password is entered
            } else {
                System.out.println("Wrong");
            }
        }
        
        scanner.close();
    }
}