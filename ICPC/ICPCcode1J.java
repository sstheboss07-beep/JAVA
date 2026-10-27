import java.util.*;
public class ICPCcode1J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a%b==0)
            System.out.println("Multiples");
        else if (b%a==0)
            System.out.println("Multiples");
        
        else
            System.out.println("No Multiples");
    }
}
