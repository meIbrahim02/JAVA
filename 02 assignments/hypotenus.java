import java.util.*;

public class hypotenus {
    public static void main(String[] args) {
        // hypotenuse c = Math.sqrt(a2 + b2)

        Scanner scan = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scan.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scan.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("hypotenus side c is: " + c);
    }
}
