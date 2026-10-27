import java.util.*;
public class ICPCcode1V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        char S = sc.next().charAt(0);
        int B = sc.nextInt();
    if (S == '<') {
        if (A < B) {
            System.out.println("Right");
        } else {
            System.out.println("Wrong");
        }
    } else if (S == '>') {
        if (A > B) {
            System.out.println("Right");
        } else {
            System.out.println("Wrong");
        }
    }
     else if (S == '=') {
        if (A == B) {
            System.out.println("Right");
        } else {
            System.out.println("Wrong");
        }
    }
    
}
}
