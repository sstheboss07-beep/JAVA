import java.util.Scanner;

public class ICPCcode1U {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

    double X = sc.nextDouble();

    int integerPart = (int) X;

    if (X == integerPart) {
        System.out.println("int " + integerPart);
    } else {
        double decimalPart = X - integerPart;
        System.out.println("float " + integerPart + " " + String.format("%.3f", decimalPart));
    }

    sc.close();
}

}