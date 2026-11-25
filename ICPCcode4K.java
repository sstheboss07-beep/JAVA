import java.util.*;
public class ICPCcode4K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            String s = sc.next();
            String t = sc.next();

            StringBuilder ans = new StringBuilder();

            int min = Math.min(s.length(), t.length());

            for (int i = 0; i < min; i++) {
                ans.append(s.charAt(i));
                ans.append(t.charAt(i));
            }

            if (s.length() > min) {
                ans.append(s.substring(min));
            }

            if (t.length() > min) {
                ans.append(t.substring(min));
            }

            System.out.println(ans);
        }
    }
}