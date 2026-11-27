import java.util.*;
public class ICPCcode3N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();

        boolean check = true;

        if (s.length() != a + b + 1) {
            check = false;
        } else {
            for (int i = 0; i < s.length(); i++) {

                if (i == a) {
                    if (s.charAt(i) != '-') {
                        check = false;
                    }
                } else {
                    if (s.charAt(i) < '0' || s.charAt(i) > '9') {
                        check = false;
                    }
                }
            }
        }
        if (check) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
