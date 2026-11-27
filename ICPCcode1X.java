import java.util.*;
public class ICPCcode1X {
    public static void main(String[]args){
  Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int start = Math.max(l1, l2);
        int end = Math.min(r1, r2);

        if (start <= end) {
            System.out.println(start + " " + end);
        } else {
            System.out.println(-1);
        }

        sc.close();
    }
}
