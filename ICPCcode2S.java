import java.util.Scanner;
public class ICPCcode2S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = 0;
            if (x > y) {
                int temp = x;
                x = y;
                y = temp;
            }
            for (int i = x + 1; i < y; i++) {

                if (i % 2 != 0) {
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
    }
}

/*
import java.util.Scanner;
public class ICPCcode2S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int sum = 0;
            int start = Math.min(x, y);
            int end = Math.max(x, y);
            for (int i = start + 1; i < end; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
    }
}
*/