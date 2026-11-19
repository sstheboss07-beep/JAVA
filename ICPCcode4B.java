import java.util.*;
public class ICPCcode4B {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int pos = s.indexOf('\\');

        System.out.println(s.substring(0, pos));
    }
}