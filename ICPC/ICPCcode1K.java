import java.util.*;
public class ICPCcode1K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int min = Math.min(A, Math.min(B, C));
        int max = Math.max(A, Math.max(B, C));

        System.out.println(min + " " + max);
    }
}

