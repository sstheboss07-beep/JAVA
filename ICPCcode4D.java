import java.util.*;
public class ICPCcode4D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        // Print length
        System.out.println(a.length() + " " + b.length());

        // Concatenate strings
        System.out.println(a + b);

        // Swap first characters
        char first = a.charAt(0);
        char second = b.charAt(0);

        a = second + a.substring(1);
        b = first + b.substring(1);

        System.out.println(a + " " + b);
    }
}
