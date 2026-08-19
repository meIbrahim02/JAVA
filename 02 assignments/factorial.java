import java.util.Scanner;

public class factorial {
    public static int calculateFactorial(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is " + calculateFactorial(number));
        }

        scanner.close();
    }
}
