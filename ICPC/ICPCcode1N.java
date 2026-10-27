import java.util.*;
public class ICPCcode1N {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    char x = sc.next().charAt(0);

    if (x >= 'a' && x <= 'z') {
        x = (char)(x - 32);
    } else {
        x = (char)(x + 32);
    }

    System.out.println(x);
 
}
}

