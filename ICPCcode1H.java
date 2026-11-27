import  java.util.*;
public class ICPCcode1H {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
System.out.println("floor " + a + " / " + b + " = " +( a / b));
if (a==b)
    System.out.println("ceil " + a + " / " + b + " = " +( a / b));
else
    System.out.println("ceil " + a + " / " + b + " = " +( a / b+1));
System.out.println("round " + a + " / " + b + " = " + Math.round((double) a / b));
}
}