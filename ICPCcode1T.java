import java.util.*;
public class ICPCcode1T {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] arr = {A, B, C};

        Arrays.sort(arr);

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }
}
