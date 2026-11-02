    import java.util.Scanner;

public class ICPCcode2I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        
        // 1. Reverse the string using StringBuilder
        StringBuilder sb = new StringBuilder(n);
        String reversed = sb.reverse().toString();
        
        // 2. Convert to integer to automatically remove any leading zeros, 
        // then convert back to String to print
        int num = Integer.parseInt(reversed);
        System.out.println(num);
        
        // 3. Check if the original number equals its reversed version
        if (n.equals(reversed)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
