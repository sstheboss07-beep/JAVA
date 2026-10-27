
import java.util.*;

public class ICPCcode1O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int i = 0;
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            i++;
        }

        int a = Integer.parseInt(s.substring(0, i));
        char op = s.charAt(i);
        int b = Integer.parseInt(s.substring(i + 1));

        if (op == '+')
            System.out.println(a + b);
        else if (op == '-')
            System.out.println(a - b);
        else if (op == '*')
            System.out.println(a * b);
        else if (op == '/')
            System.out.println(a / b);
    }
}

