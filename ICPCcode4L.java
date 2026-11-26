import java.util.*;
public class ICPCcode4L  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        StringBuilder s = new StringBuilder(sc.next());

        while (q-- > 0) {
            String query = sc.next();

            if (query.equals("pop_back")) {
                s.deleteCharAt(s.length() - 1);
            }

            else if (query.equals("front")) {
                System.out.println(s.charAt(0));
            }

            else if (query.equals("back")) {
                System.out.println(s.charAt(s.length() - 1));
            }

            else if (query.equals("sort")) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                char[] arr = s.substring(l - 1, r).toCharArray();
                Arrays.sort(arr);

                for (int i = 0; i < arr.length; i++) {
                    s.setCharAt(l - 1 + i, arr[i]);
                }
            }

            else if (query.equals("reverse")) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                StringBuilder temp = new StringBuilder(s.substring(l - 1, r));
                temp.reverse();

                for (int i = 0; i < temp.length(); i++) {
                    s.setCharAt(l - 1 + i, temp.charAt(i));
                }
            }

            else if (query.equals("print")) {
                int pos = sc.nextInt();
                System.out.println(s.charAt(pos - 1));
            }

            else if (query.equals("substr")) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                System.out.println(s.substring(l - 1, r));
            }

            else if (query.equals("push_back")) {
                char x = sc.next().charAt(0);
                s.append(x);
            }
        }

        sc.close();
    }
}