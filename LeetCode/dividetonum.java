/* 
import java.util.Scanner;
public class dividetonum {
    //Divide To Number without using /,%,*;

    public int divide(int dividend, int divisor) {
        int num = 0;
        if (dividend < divisor) {
            return 0;
        }
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            num++;
        }
        return num;
    }
    public static void main(String[] args) {
        dividetonum obj = new dividetonum();
        int ans = obj.divide(10, 2);
        System.out.println(ans);
    }
}
    */



class Solution {
    public int divide(int dividend, int divisor) {

        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) != (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long num = 0;

        while (a >= b) {
            a = a - b;
            num++;
        }
        if (negative) {
            num = -num;
        }
        return (int) num;
    }
}
