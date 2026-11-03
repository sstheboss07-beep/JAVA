import java.util.*;
public class ICPCcode1W {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        char S = sc.next().charAt(0);
        int B = sc.nextInt();

        sc.next(); // '=' sign ko read karne ke liye

        int C = sc.nextInt();
        int result = 0;

        switch (S) {
            case '+':
                result = A + B;
                break;

            case '-':
                result = A - B;
                break;

            case '*':
                result = A * B;
                break;
        }

        if (result == C) {
            System.out.println("Yes");
        } else {
            System.out.println(result);
        }

        sc.close();
    }
    
} 
      
