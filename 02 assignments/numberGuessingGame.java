import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        int number = 56;
        int userNumber;

        Scanner sc = new Scanner(System.in);
        System.out.print("guess the number : ");
        userNumber = sc.nextInt();

        while( number != userNumber){
            System.out.println("wrong guess");
            System.out.println("try again!");
            System.out.print("guess the number : ");
            userNumber = sc.nextInt();
        }

        System.out.println("correct");

        sc.close();
    }
}
