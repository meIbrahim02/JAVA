import java.util.Scanner;
public class inputerror {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();
        
        // System.out.print("Enter your Favorite color: ");
        // String color = scanner.nextLine();

        // System.out.println("your age is: " + age);
        // System.out.println("you like the color:" + color);

        // scanner.close();

        // to fix the error coming in above output we add "scanner.nextLine()"

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Enter your Favorite color: ");
        String color = scanner.nextLine();

        System.out.println("your age is: " + age);
        System.out.println("you like the color:" + color);

        scanner.close();

    }
}
