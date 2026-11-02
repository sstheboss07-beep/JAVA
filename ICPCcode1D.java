import java.util.*;
public class ICPCcode1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        long x =(long)a*b-(long)c*d;
        System.out.println("Difference = "+ x);
    }
}

