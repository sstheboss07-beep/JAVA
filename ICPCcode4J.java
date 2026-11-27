import java.util.*;
public class ICPCcode4J {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int arr[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                System.out.println((char)(i + 'a') + " : " + arr[i]);
            }
        }
    }
}
