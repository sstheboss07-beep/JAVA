import java.util.*;
public class ICPCcode1P {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int first = x / 1000;
        if (first % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}
