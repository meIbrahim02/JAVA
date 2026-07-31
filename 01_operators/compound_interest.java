import java.util.Scanner;

public class compound_interest {
    public static void main(String[] args) {
        // compound interest calculator

        Scanner scan = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int year;
        double amount;

        System.out.println("Enter the principal amount: ");
        principal = scan.nextDouble();

        System.out.println("Enter the rate amount: ");
        rate = scan.nextDouble();

        System.out.println("Enter the # of timesCompounded amount: ");
        timesCompounded = scan.nextInt();

        System.out.println("Enter the # of year: ");
        year = scan.nextInt();

        amount = principal * Math.pow(1+rate/timesCompounded, timesCompounded * year );
        System.out.printf("the compount interest is %.3f", amount);

        scan.close();
    }
}
